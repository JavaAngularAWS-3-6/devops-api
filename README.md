# Cloud Fundamentals

Two options for hosting our app
- On premise
- On the cloud

## On Premise

Worry about security and routing

Worry about buying all the equipment and the up front costs that come along with that

Hire people to maintain and run that equipment

## Cloud Computing Definition

Utilizing resources from a server across the internet
- just a computer running somewhere that you have access to
- similar to renting memory/computing power from that computer on the internet

Offering infrastructure, resources, or applications over the internet

Why cloud computing?
- More flexible
- More scalable, and easier to scale
- More cost effective
- More availability
- Fault Tolorance

## Cloud Computing Models

Infrastructure as a Service
- renting out some server, where you have to manage
- amazon EC2
  - OS
  - DATA
  - RUNTIMES
  - APPLICATIONS

Platform as a Service
- renting some server that is preconfigured with services you need
- amazon RDS
    - DATA
    - APPLICATIONS

Software as a Service
- renting some software running on their servers
- Google Docs
  - Everything is being managed by the cloud provider, you just use the application

![models](https://f4n3x6c5.stackpathcdn.com/article/what-is-cloud-computing-explore-the-services-and-deployment-models/Images/IaaS-PaaS-SaaS-Cloud-Services.png)

![pizza as a service](https://www.coupa.com/sites/default/files/blog_images/content/blogs/pizza_as_a_service.png)

## Cloud Computing Service Providers

AWS - Amazon Web Services

Azure - (Microsoft)

GCP - Google Cloud Platform

## AWS - Amazon Web Services

Amazons entry into the cloud computing market
- Comprehensize cloud computing software
- Provides programmers with a wide range of computing services over the cloud, to aid in the development and deployment of applications
    - Storage, databases, machine learning, servless features, computing power

Why AWS?
- Cheaper than building infrastructure
  - pay-per-use/subscription model
  - no need to buy all the equipment to host server
- More scalable than in house solutions
  - Automatically scale resources during heavy traffic time
- Globally distribute products easily
- Amazon manage software or infrastructure for you

AWS Regions and Availability Zones

- AWS hosts its services across 77 availabilty zones in 24 regions
- Region: geographic location with clusters of available zones
  - Isolated and independent of other zones
  - Allows us to access services from across the globe
    - Faster and more reliable load times from basically everywhere
- Availablity Zone: physical building where Amazon servers live
  - Regions are made up of multiple Availability zones
    - redundancy for security and reliability
-   https://www.aws.amazon.com/about-aws/global-infrastructure

## Security and Access

VPC - Virtual Private Cloud

- Virtualized Network
  - Allow multiple resources to share a private network, and communicate with one another without being publically accessible

Security Groups
- virtual firewalls
- allow protocol and port level access to services
  - amazon uses block everything
  - make whitelists
- set of rules to filter incoming and outgoing traffic, this is how we can open up a port publically to a service

## AWS EC2 - Elastic Compute Cloud

Virtual machine in the cloud
- web service that provides secure, scalable compute capacity in the cloud
- infrastructure as a service
  - Amazon is providing the physical infrastructure, the storage, security all on the cloud
  - we only need to worry about customizing whats on the os
- places to deploy our applications, configure the security to allow people to access the application
- type of the ec2 (t2, t3, t4..) indicicates the amount of computing power
- tags can be placed on them to help describe what they are for/for metadata
- to access them we use ssh and keypairs

AMI - Amazon Machine Image
- a template for what OS/Software you want preinstalled on an ec2
- create your own, theres an aws market place, quickstart

EBS - Elastic Block Storage
- Volumes of block storage that we can use with ec2's
- One of many storage devices on aws
  - Special because they MUST be attacked to an ec2
- just harddrive/ssd space to add onto virtual machines

## EC2 Autoscaling

Allows us to create and remove instances of an ec2 as we need with traffic
- assigning an ec2(s) to an autoscaling group
- aws will/can determine when more resources are needed
  - automatically create and terminate ec2's for us
- this is considered horizontal scaling
  - apposed to onsite scaling (vertical), where you have to add more ram, more cpu, more hdd etc.
- utilize Elastic Load Balanacers when autoscaling, so we can still access any of the resources

ELB - Elastic Load Balancer
- distribute incoming traffic across multiple aws resources
- send a request load balanacer, and it will forward that request to an available resource

## AWS RDS - Relational Database Service

Easily setup, operate, and scale relational databases
- specialized EC2 instance with a database server installed
- allows others to access a shared database
- scalable
- aws manages the adminstration tasks of the database for

## AWS S3 - Simple Storage Service

object storage solution on the aws cloud
- store anything that you want
- uses buckets which is a organizational structure for storing data
- different from file storage
  - file storage uses a tree like structure
  - object storage is more like a heap
    - objects can be literally anything
    - objects store more information about the object in the form of metadata
    - no hierarchy in object storage, everything is just thrown into a bucket
    - every object has a url associated with it to gain access to it
- all objects have a unique id of name + bucket + versionID
- objects contain the information + metadata
- you can store unimaginable amount of data, free tier is someingthing along the lines of 5 TB
- durable and available
  - automatically distributes across a minimum of three physcial locations
- there are different tiers of s3 for different use cases
  - s3 glacier, which is slower but holds more data cheaper

AWS S3 Public bucket configuration:
