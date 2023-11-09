# 12 factors

    + Codebase: My code is tracked and organized in a single repository per application. 

    + Dependencies: I explicitly declared and isolated dependencies, using Maven to define and manage dependencies in a consistent, isolated manner.

    Config: Store configuration in the environment. Use environment variables or configuration files outside the codebase to store configuration data (API keys, database URLs, etc.) and avoid hardcoding them in the code. 
      My Project has no Config  

    + Backing Services: Treat backing services as attached resources. Access external services (databases, caches, message brokers) through standardized interfaces. Use environment variables for connection  details.
      Spring handles the accessing of external services through interfaces.

    Build, Release, Run: Strictly separate build, release, and run stages. Automate the build and deployment process, maintain clear separation between development, building the application, and running it in production.
      I have no CI/CD pipeline due to lack of time, else this would be implemented

    + Processes: Execute the app as one or more stateless processes. Design your application to be stateless and share-nothing, scaling by running multiple identical stateless processes.

    + Port Binding: Export services via port binding. Applications should be self-contained and export services through a port binding. Use web servers or containers to expose the application.

    Concurrency: Scale out via the process model. Scale out by adding more processes rather than scaling up individual processes. Use tools like load balancers to distribute traffic.
      My app is too simple to implement this factor.
      
    Disposability: My app maximized robustness with fast startup and graceful shutdown, using Docker, which is easily scalable.

    Dev/prod Parity: Keep development, staging, and production as similar as possible. Use similar environments and configurations for development, testing, and production to minimize issues and inconsistencies.

    Logs: Treat logs as event streams. Generate logs in a structured format and stream them to a centralized location. Use logging frameworks and aggregation tools.

    Admin Processes: Run admin/management tasks as one-off processes. Use the same codebase and deployment for admin tasks, but execute them as separate, short-lived processes.
