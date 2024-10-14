Telecoms Application - Minimum Spanning Tree Project

The coursework project aims to implement an application for optimizing a high-speed fiber-optic network across European capitals, adhering to specific requirements. The system uses a command-line interface (CLI) for user interaction, providing a straightforward approach to load and process graph data, view capitals, and compute the Minimum Spanning Tree (MST).

Key Features:

File Loading and Graph Creation: Load data from a file containing distances between European capitals, constructing a graph to represent the connections.

Graph Representation: The capitals are represented as nodes, and the distances between them are represented as edges in the graph.

Minimum Spanning Tree Calculation: The application computes the MST using Prim's algorithm, optimizing the total cable length required to connect all capitals with minimal cost.

Capitals Viewing: Users can view a list of loaded capitals after loading the data file.

User-Friendly Interface: The command-line interface allows for easy interaction with commands to load data, view capitals, calculate MST, and exit the application.

Implementation Principles:

Object-Oriented Design: The project follows an object-oriented approach with classes for edges, nodes, and the graph, ensuring modularity and maintainability.

Separation of Concerns: The project uses dedicated classes (GraphLoader, GraphViewer, and Graph) to separate responsibilities, enhancing code organization and readability.

Error Handling: The system includes error handling for incorrect file formats, ensuring robustness when loading graph data.

Version Control System (VCS): The project utilizes a Version Control System (VCS) for collaborative development, enabling efficient code management and collaboration among team members.

Commands and Usage:

load : Load the distances between European capitals from a file.

view: View the list of loaded capitals.

mst: Calculate and display the Minimum Spanning Tree of the loaded graph.

exit: Exit the application.

By adhering to these principles and practices, the project aims to deliver a reliable and maintainable solution for optimizing a telecommunications network, meeting the requirements specified in the coursework.

