package assignedon06_13_22;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MergeSortedListsTest {

	@Test
	void test0() {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList list3 = new LinkedList();

		list1.add(1);
		list1.add(4);
		list1.add(5);

		list2.add(1);
		list2.add(3);
		list2.add(4);

		list3.add(2);
		list3.add(6);

		LinkedList[] lList = { list1, list2, list3 };

		LinkedList alist = MergeSortedLists.mergeLinkedLists(lList);

		LinkedList blist = new LinkedList();
		blist.add(1);
		blist.add(1);
		blist.add(2);
		blist.add(3);
		blist.add(4);
		blist.add(4);
		blist.add(5);
		blist.add(6);

		Assert.assertEquals("Booyah!", blist, alist);
	}

	@Test
	void test1() {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList list3 = new LinkedList();

		list1.add(3);
		list1.add(4);
		list1.add(8);

		list2.add(1);
		list2.add(9);
		list2.add(19);

		list3.add(2);
		list3.add(8);

		LinkedList[] lList = { list1, list2, list3 };

		LinkedList alist = MergeSortedLists.mergeLinkedLists(lList);

		LinkedList blist = new LinkedList();
		blist.add(1);
		blist.add(2);
		blist.add(3);
		blist.add(4);
		blist.add(8);
		blist.add(8);
		blist.add(9);
		blist.add(19);

		Assert.assertEquals("Booyah!", blist, alist);
	}

	@Test
	void test2() {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList list3 = new LinkedList();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);

		list2.add(1);
		list2.add(3);
		list2.add(5);
		list2.add(7);
		list2.add(9);
		list2.add(11);
		list2.add(13);
		list2.add(15);
		list2.add(17);

		list3.add(2);
		list3.add(6);
		list3.add(10);
		list3.add(14);
		list3.add(18);
		list3.add(22);
		list3.add(26);
		list3.add(30);

		LinkedList[] lList = { list1, list2, list3 };

		LinkedList alist = MergeSortedLists.mergeLinkedLists(lList);

		LinkedList blist = new LinkedList();
		blist.add(1);
		blist.add(1);
		blist.add(2);
		blist.add(2);
		blist.add(3);
		blist.add(3);
		blist.add(4);
		blist.add(5);
		blist.add(5);
		blist.add(6);
		blist.add(6);
		blist.add(7);
		blist.add(9);
		blist.add(10);
		blist.add(11);
		blist.add(13);
		blist.add(14);
		blist.add(15);
		blist.add(17);
		blist.add(18);
		blist.add(22);
		blist.add(26);
		blist.add(30);

		Assert.assertEquals("Booyah!", blist, alist);
	}
}
