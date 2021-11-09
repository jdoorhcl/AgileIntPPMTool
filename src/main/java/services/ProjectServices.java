package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.josh.Project;

import repositories.ProjectRepository;

@Service
public class ProjectServices {

	
		@Autowired
		private ProjectRepository projectRepository;
		
		public Project saveOrUpdateProject(Project project) {
			
			
			return projectRepository.save(project);
			
		}
}
