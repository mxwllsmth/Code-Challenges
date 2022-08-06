package Hard;

import java.util.*;

public class NavigateFileSystem {

    //  Tested in Hard test folder

    /*
    You are provided the following class -
     */

    public static class Entity {
        Integer size;
        int[] children;
        String name;
        String type;

        public Entity(Integer size, int[] children, String name, String type) {
            this.size = size;
            this.children = children;
            this.name = name;
            this.type = type;
        }
    }

    /*
    - You are given a Map of <Integer, Entity> entities, representing a file system -
    - Files and directories are Entities (of the class Entity)
    - Files have IDs from 1, ascending
    - Files have an ID, size, name, and type
    - Directories have an ID, name, children, and type
    - Note that files can exist at the same level as "root - ID: 1" (EX: "file5 - ID: 8")

                              - File System Example -
    ID: 1 --> type: directory --> size: null --> children: [2,3] --> name: root
    ID: 2 --> type: directory --> size: null --> children: [4,5] --> name: dir1
    ID: 3 --> type: file --> size: 100 --> children: null --> name: file1
    ID: 4 --> type: file --> size: 200 --> children: null --> name: file2
    ID: 5 --> type: file --> size: 300 --> children: null --> name: file3
    ID: 6 --> type: directory --> size: null --> children: [7,9] --> name: dir2
    ID: 7 --> type: file --> size: 600 --> children: null --> name: file4
    ID: 8 --> type: file --> size: 50 --> children: null --> name: file5
    ID: 9 --> type: file --> size: 10 --> children: null --> name: file6
     */



    //  Custom toString for list
    public String listToString(List<String> input) {
        StringBuilder output = new StringBuilder();
        for(int i = 0 ; i < input.size() ; i++) {
            output.append(input.get(i));
        }
        return output.toString();
    }



    /*
    Navigate File System Part I-
    Return total file size for an input entityID
    */

    public int getSizeOfEntity(int entityID, Map<Integer, Entity> entities) {

        int totalSize = 0;
        //  If ID leads to a directory
        if(Objects.equals(entities.get(entityID).type, "directory")) {
            //  For each child of the directory
            for(int i : entities.get(entityID).children) {
                //  Pass the child's ID back into the method and add the result to totalSize
                totalSize += getSizeOfEntity(i, entities);
            }
        //  If ID leads to a file
        } else {
            //  Add the file size to totalSize
            totalSize += entities.get(entityID).size;
        }
        return totalSize;
    }



    /*
    Navigate File System Part II-
    Return path from root through an input entityID
     */

    public List<String> pathList = new ArrayList<>();
    public Stack<Integer> indexPath = new Stack<>();
    public boolean foundEntityId = false;

    public String getPathToEntity(int entityID, Map<Integer, Entity> entities, int startVal) {
        int i = startVal;
        //  Loop until entity ID is encountered
        while(i <= entities.size()) {
            //  If desired entityID has been found STOP
            if(foundEntityId) {
                break;
            }
            //  If desired entityID is encountered
            if(i == entityID) {
                //  Add to path list and Return
                pathList.add("/" + entities.get(i).name);
                foundEntityId = true;
                break;
            }
            //  If directory is encountered
            if(Objects.equals(entities.get(i).type, "directory")) {
                //  Track index where directory was encountered
                indexPath.add(i);
                //  Add directory to path list and count
                pathList.add("/" + entities.get(i).name);
                //  For each child of the directory
                for(int x : entities.get(i).children) {
                    //  Set start value to child and pass back into the method
                    startVal = x;
                    getPathToEntity(entityID, entities, startVal);
                    //  If at last child
                    if(x == entities.get(i).children[entities.get(i).children.length - 1]) {
                        //  If desired entityID was not found
                        if(!foundEntityId) {
                            //  Empty path list to recent directory
                            //  If path list is greater than 1
                            if(pathList.size() > 1) {
                                while(pathList.size() > 1) {
                                    pathList.remove(pathList.size() - 1);
                                    indexPath.pop();
                                }
                            //  If path list has only 1
                            } else {
                                pathList.remove(pathList.size() - 1);
                                indexPath.pop();
                            }
                        }
                    }
                }
            // If index path contains integers
            } else if(!indexPath.isEmpty()) {
                //  Set start value to last element in stack and STOP
                startVal = indexPath.peek();
                break;
            }
            //  Increment i
            i++;
        }
        return listToString(pathList);
    }

}
