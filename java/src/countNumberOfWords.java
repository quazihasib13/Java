class countNumberOfWords{
	
	public static void main(String[] args){
		
		String st="hello hello abs";
		
		String[] words=st.split(" ");
		String word=" ";
		int[] count=new int[20];
		
		for(int i=0;i<words.length;i++){
			
			word=words[i];
			for(int j=0;j<words.length;j++){
				if(words[j].equals(word)){
					count[i]++;
				}
			}
			for(int y=0;y<words.length;y++){
				System.out.println(words[y]+"\t"+count[y]);
				if(count[y]==1){
					System.out.println("unique are:"+words[y]+"\t"+count[y]);
				}
			}
			
		}
	}
	
}