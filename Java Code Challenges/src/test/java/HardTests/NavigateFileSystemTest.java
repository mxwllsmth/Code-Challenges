package HardTests;

import Hard.NavigateFileSystem;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class NavigateFileSystemTest {

    public Map<Integer, NavigateFileSystem.Entity> testSystem = new HashMap<>();

    NavigateFileSystem nfs;

    @Before
    public void setup() {
        nfs = new NavigateFileSystem();
        testSystem.put(1, new NavigateFileSystem.Entity(null, new int[]{2, 3, 6}, "root", "directory"));
        testSystem.put(2, new NavigateFileSystem.Entity(null, new int[]{4, 5}, "dir1", "directory"));
        testSystem.put(3, new NavigateFileSystem.Entity(100, null, "file1", "file"));
        testSystem.put(4, new NavigateFileSystem.Entity(200, null, "file2", "file"));
        testSystem.put(5, new NavigateFileSystem.Entity(300, null, "file3", "file"));
        testSystem.put(6, new NavigateFileSystem.Entity(null, new int[]{7, 9}, "dir2", "directory"));
        testSystem.put(7, new NavigateFileSystem.Entity(600, null, "file4", "file"));
        testSystem.put(8, new NavigateFileSystem.Entity(50, null, "file5", "file"));
        testSystem.put(9, new NavigateFileSystem.Entity(10, null, "file6", "file"));
    }

    @After
    public void breakdown() {
        nfs = null;
    }

    //  Get size of the given Entity
    @Test
    public void getSizeFromEntityId() {

        int actual = nfs.getSizeOfEntity(1, testSystem);
        int expected = 1210;

        int actual2 = nfs.getSizeOfEntity(4, testSystem);
        int expected2 = 200;

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }

    //  Get path to the given entity - looking for root
    @Test
    public void getPathToEntityIdRoot() {

        String actual = nfs.getPathToEntity(1, testSystem, 1);
        String expected = "/root";

        Assert.assertEquals(expected, actual);
    }

    //  Get path to the given entity - inner directories
    @Test
    public void getPathToEntityIdInnerDirectories() {

        String actual = nfs.getPathToEntity(4, testSystem, 1);
        String expected = "/root/dir1/file2";

        Assert.assertEquals(expected, actual);
    }

    //  Get path to the given entity - multiple inner directories with backtracking
    @Test
    public void getPathToEntityIdMultipleInnerDirectoriesWithBacktracking() {

        String actual = nfs.getPathToEntity(8, testSystem, 1);
        String expected = "/file5";

        Assert.assertEquals(expected, actual);
    }

    //  Get path to the given entity - with backtracking
    @Test
    public void getPathToEntityIdWithBacktracking() {

        String actual = nfs.getPathToEntity(3, testSystem, 1);
        String expected = "/root/file1";

        Assert.assertEquals(expected, actual);
    }

    //  Get path to the given entity looking for second child - with backtracking
    @Test
    public void getPathToEntityIdWhichIsASecondChild() {

        String actual = nfs.getPathToEntity(9, testSystem, 1);
        String expected = "/root/dir2/file6";

        Assert.assertEquals(expected, actual);
    }
}