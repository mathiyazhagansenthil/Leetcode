class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int traning=0,n=energy.length;
        for(int i=0;i<n;i++)
        {
            if(energy[i]>=initialEnergy)
            {
                int diff=energy[i]-initialEnergy;
                traning+=diff+1;
                initialEnergy+=diff+1;
            }
            if(experience[i]>=initialExperience)
            {
                int diff=experience[i]-initialExperience;
                traning+=diff+1;
                initialExperience+=diff+1;
            }
            initialEnergy-=energy[i];
            initialExperience+=experience[i];
        }
        return traning;
    }
    
}