package ref;

import java.util.List;

public class ReplaceInheritanceWithDelegation {

	/*START
	class MyStack extends Vector {
		public void push(Object element) {
			insertElementAt(element, 0);
		}

		public Object pop() {
			Object result = firstElement();
			removeElementAt(0);
			return result;
		}
	}
	*/
	
	class MyStack  {
		
		private List _list;
		
		public void push(Object element) {
			_list.add(element);
		}

		public Object pop() {
			return _list.remove(_list.size() - 1);
		}
	}

}
