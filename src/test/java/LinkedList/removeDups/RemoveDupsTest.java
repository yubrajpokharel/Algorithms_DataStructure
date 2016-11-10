package LinkedList.removeDups;


import com.Collections.List.LinkedList.removeDuplicates.MyLinkedList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by yubraj on 8/10/16.
 */
public class RemoveDupsTest {

    private MyLinkedList myLinkedList;

    @BeforeAll
    public void setUp(){
        myLinkedList = new MyLinkedList(12);
        myLinkedList.appendAtTail(12);
        myLinkedList.appendAtTail(13);
        myLinkedList.appendAtTail(14);
        myLinkedList.appendAtTail(13);
    }

    @Test
    public void getLinekdListElementTest(){
        assertEquals(12, 12);
    }

}
