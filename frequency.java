package project113;

public class frequency {		
		static int FrequencyCount(int arr[], int target, boolean flag)
		{
	        int low = 0, high = arr.length - 1;
	        int result = -1;

		    while (low <= high) 
		    {
	            int mid = low + (high - low) / 2;

	            	if (arr[mid] == target) 
	            	{
		                result = mid;
		                if (flag == true)
		                {
		                    low = mid + 1;
		                }
		                else
		                    high = mid - 1;
		            }
	            	else if (arr[mid] < target)
	            	{
		                low = mid + 1;
		            } else
		                high = mid - 1;

		        }
		        return result;
		    }

		    public static void main(String[] args) {
		        int arr[] = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
		        int target =6;
		        int lower_idx = FrequencyCount(arr, target, false);
		        int uppper_idx = FrequencyCount(arr, target, true);

		        
		        System.out.println(uppper_idx - lower_idx + 1);
		    }
		}

