USE [master]
GO
/****** Object:  Database [ATMDB]    Script Date: 10/03/2013 09:55:23 ******/
CREATE DATABASE [ATMDB] ON  PRIMARY 
( NAME = N'ATMDB', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\ATMDB.mdf' , SIZE = 2048KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'ATMDB_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\ATMDB_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [ATMDB] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ATMDB].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ATMDB] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [ATMDB] SET ANSI_NULLS OFF
GO
ALTER DATABASE [ATMDB] SET ANSI_PADDING OFF
GO
ALTER DATABASE [ATMDB] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [ATMDB] SET ARITHABORT OFF
GO
ALTER DATABASE [ATMDB] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [ATMDB] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [ATMDB] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [ATMDB] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [ATMDB] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [ATMDB] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [ATMDB] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [ATMDB] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [ATMDB] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [ATMDB] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [ATMDB] SET  DISABLE_BROKER
GO
ALTER DATABASE [ATMDB] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [ATMDB] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [ATMDB] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [ATMDB] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [ATMDB] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [ATMDB] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [ATMDB] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [ATMDB] SET  READ_WRITE
GO
ALTER DATABASE [ATMDB] SET RECOVERY FULL
GO
ALTER DATABASE [ATMDB] SET  MULTI_USER
GO
ALTER DATABASE [ATMDB] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [ATMDB] SET DB_CHAINING OFF
GO
EXEC sys.sp_db_vardecimal_storage_format N'ATMDB', N'ON'
GO
USE [ATMDB]
GO
/****** Object:  Table [dbo].[User_Group]    Script Date: 10/03/2013 09:55:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[User_Group](
	[Group_Id] [int] NOT NULL,
	[Group_Name] [varchar](100) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Group_Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[User_Group] ([Group_Id], [Group_Name]) VALUES (1, N'Administrator')
INSERT [dbo].[User_Group] ([Group_Id], [Group_Name]) VALUES (2, N'Staff')
/****** Object:  Table [dbo].[Customer]    Script Date: 10/03/2013 09:55:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Customer](
	[Customer_ID] [int] NOT NULL,
	[ID_Card_No] [varchar](11) NULL,
	[Customer_FullName] [varchar](40) NULL,
	[Customer_DoB] [datetime] NULL,
	[Customer_Gender] [varchar](15) NULL,
	[Customer_Phone] [varchar](15) NULL,
	[Customer_Address] [varchar](300) NULL,
	[Customer_Status] [varchar](15) NULL,
	[Customer_Status_Reason] [varchar](300) NULL,
PRIMARY KEY CLUSTERED 
(
	[Customer_ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[ID_Card_No] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (5, N'111-111-111', N'Nguyen Van A', CAST(0x0000A23100000000 AS DateTime), N'Male', N'2143352472', N'12 Nguyen Van Linh', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (6, N'122-111-111', N'Nguyen Van B', CAST(0x0000A23100000000 AS DateTime), N'Male', N'8173194163', N'15 Quang Trung', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (7, N'222-111-111', N'Nguyen Van C', CAST(0x0000A23100000000 AS DateTime), N'Male', N'2547730861', N'280 Tran Cao Van', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (8, N'334-444-444', N'Tran Van D', CAST(0x0000A23000000000 AS DateTime), N'Male', N'22442323424', N'02 Nguyen Van Linh', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (9, N'555-555-555', N'Kent Nguyen', CAST(0x0000A23100000000 AS DateTime), N'Male', N'322344234', N'111 Van Cao', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (10, N'453-453-453', N'scott r mcewen', CAST(0x0000762500000000 AS DateTime), N'Male', N'6235121978', N'15725 w peakview rd', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (11, N'434-343-434', N'Philip W. Newkirk', CAST(0x000075A500000000 AS DateTime), N'Male', N'8177981050', N'110 A PALO PINTO', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (12, N'113-483-943', N'Lori G Lupolt', CAST(0x0000676400000000 AS DateTime), N'Female', N'5702591238', N'17 Woodlynn Drive', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (13, N'222-223-454', N'Tamara R Cherry', CAST(0x000067A400000000 AS DateTime), N'Male', N'5416843968', N'3610 Sterling Woods Drive', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (14, N'733-993-400', N'Don L Vietti', CAST(0x0000660C00000000 AS DateTime), N'Male', N'8179373114', N'3309 Tanglewood Trail', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (15, N'211-334-888', N'Ryan Anderson', CAST(0x000066AA00000000 AS DateTime), N'Male', N'4144760131', N'474 South Lake Street Apt #1', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (16, N'773-393-899', N'Rick A Craig', CAST(0x0000635200000000 AS DateTime), N'Male', N'2548355152', N'PO Box 27', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (17, N'838-393-933', N'Malgorzata Talaga', CAST(0x0000635600000000 AS DateTime), N'Male', N'6473381328', N'79 Nantucket Drive', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (18, N'224-023-292', N'Christine Lewis', CAST(0x000072FA00000000 AS DateTime), N'Male', N'4104908209', N'172 Cougar Way', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (19, N'111-373-434', N'LadonnaJ Davis', CAST(0x00007CF500000000 AS DateTime), N'Male', N'8175722124', N'6925 Hudson Cemetery Rd.', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (20, N'111-237-434', N'John I Snodgrass Jr', CAST(0x00007CA000000000 AS DateTime), N'Male', N'8172493311', N'5429 Threshing Drive', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (21, N'112-737-391', N'Richard C. Bibb', CAST(0x00007F7300000000 AS DateTime), N'Male', N'2548236588', N'PO Box 211', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (22, N'113-943-999', N'Vuong Nguyen', CAST(0x00007B3200000000 AS DateTime), N'Male', N'0919515780', N'15 Quang Trung', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (23, N'438-111-229', N'Maureen Carroll', CAST(0x00008183011C01C7 AS DateTime), N'Female', N'8602368319', N'250 griswold drive', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (24, N'121-245-454', N'Stephen L Scannelll', CAST(0x00007E5500000000 AS DateTime), N'Male', N'9058756001', N'863 main Streer East', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (25, N'441-234-533', N'Robyn C. Haug', CAST(0x00007E5D00000000 AS DateTime), N'Male', N'6364772715', N'3005 Cherokee Lane', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (26, N'342-222-211', N'Shawn Lett', CAST(0x0000834600000000 AS DateTime), N'Male', N'4693962928', N'7125 Marvin D. Love Freeway Suite 202', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (27, N'235-656-565', N'Eric Chartier', CAST(0x0000839300000000 AS DateTime), N'Male', N'8173127749', N'206 Cardinal Ct', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (28, N'113-455-656', N'Elizabeth Petry', CAST(0x00006F9D00000000 AS DateTime), N'Male', N'8602311473', N'394 North Quaker Lane', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (29, N'232-323-232', N'Melissa Masiello', CAST(0x00006F9B00000000 AS DateTime), N'Female', N'8452065695', N'118 Duda Lane', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (30, N'091-203-345', N'Toni-Marie Zuzolo', CAST(0x0000615800000000 AS DateTime), N'Male', N'6178175312', N'89 Burget Avenue', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (31, N'011-022-394', N'Carla Kinyo', CAST(0x0000900C01238AA6 AS DateTime), N'Female', N'9195246444', N'109 Torrey Pines Drive', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (32, N'019-928-444', N'Michael Tkaczuk', CAST(0x000086FE00000000 AS DateTime), N'Male', N'4035897852', N'5112 Brockington Road NW', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (33, N'000-499-100', N'Harold G Hickman', CAST(0x000082A900000000 AS DateTime), N'Male', N'3039735609', N'11315 W Coal Mine Dr', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (34, N'001-400-001', N'Randy D Nichols', CAST(0x000083DA00000000 AS DateTime), N'Female', N'4698538982', N'515 Vernet', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (35, N'002-333-919', N'Walter J. Lupu', CAST(0x0000619F00000000 AS DateTime), N'Male', N'5172312612', N'2770 Twin Elms Dr.', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (36, N'202-333-919', N'Michael Manning', CAST(0x0000882B00000000 AS DateTime), N'Male', N'8178252616', N'2311 Cedar Circle', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (37, N'009-122-028', N'Richard M Bautista', CAST(0x0000883B00000000 AS DateTime), N'Male', N'2145057117', N'4219 Calculus Dr.', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (38, N'001-839-001', N'Douglas Miller', CAST(0x000051F300000000 AS DateTime), N'Male', N'5177124497', N'11353 benton rd', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (39, N'013-938-399', N'Daniel Darwin', CAST(0x0000417700000000 AS DateTime), N'Male', N'8179990228', N'813 Lake View Ct E', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (40, N'029-122-203', N'James wilson', CAST(0x0000819600000000 AS DateTime), N'Male', N'8607425000', N'104 folly lane', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (41, N'229-122-203', N'Sandra Bach', CAST(0x0000819600000000 AS DateTime), N'Male', N'2892388823', N'21202 Polly Circle', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (42, N'029-232-323', N'Jesse Saldivar', CAST(0x0000819600000000 AS DateTime), N'Female', N'2103635541', N'2112 Diplomat Dr.', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (43, N'029-303-320', N'Rick Lessley', CAST(0x0000810900000000 AS DateTime), N'Male', N'4259225151', N'1229 NW 8th Street', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (44, N'029-303-411', N'Gregory H. Bevel', CAST(0x0000458200000000 AS DateTime), N'Male', N'2142363765', N'7166 Carrousel Circle', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (45, N'029-340-292', N'Tommy Newsome', CAST(0x0000757900000000 AS DateTime), N'Male', N'7707221089', N'3780 Towne Xing, NW., Apt. 906', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (46, N'902-300-811', N'Clare Gavigan', CAST(0x0000678E00000000 AS DateTime), N'Male', N'3538781805', N'9006 La Fauna Path', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (47, N'910-339-410', N'Eric M. Lichtenberg', CAST(0x000067A300000000 AS DateTime), N'Male', N'6122800269', N'14840 94th Place North', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (48, N'001-293-438', N'L K Martinson', CAST(0x0000719F00000000 AS DateTime), N'Male', N'8176948272', N'po box 70', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (49, N'002-939-111', N'Edward Evarts', CAST(0x0000719900000000 AS DateTime), N'Male', N'6175491391', N'42 Church Street', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (50, N'104-545-562', N'Scott W Magee', CAST(0x00007E7100000000 AS DateTime), N'Male', N'4104610900', N'9526 Frederick Rd', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (51, N'017-454-012', N'Steve Stratton', CAST(0x00007E0600000000 AS DateTime), N'Male', N'3032414401', N'7388 S Lafayette Cir West', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (52, N'019-375-911', N'Ariel Bravo', CAST(0x000058A000000000 AS DateTime), N'Female', N'7205309145', N'10497 Hobbit Lane', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (53, N'037-193-456', N'Michael A Godo', CAST(0x0000756D00000000 AS DateTime), N'Male', N'7192310687', N'403 S. Newcombe St.', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (54, N'729-142-099', N'James A Riz', CAST(0x00007C8F00000000 AS DateTime), N'Male', N'6128407223', N'17187 73rd Place N', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (55, N'901-934-045', N'Perry J Tassin', CAST(0x00007CC500000000 AS DateTime), N'Female', N'8178891223', N'903 Canyon Drive', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (56, N'340-457-324', N'Zachary D Porter', CAST(0x00006E7C00000000 AS DateTime), N'Male', N'6163082903', N'1009 McArthur St', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (57, N'734-056-034', N'Hemamalini Thyagarajan', CAST(0x00005EFE00000000 AS DateTime), N'Female', N'6147678038', N'5706 Ebner Circle', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (58, N'920-351-945', N'Danny Adams', CAST(0x00005EDF00000000 AS DateTime), N'Female', N'9709842146', N'P.O. Box 395', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (59, N'092-486-723', N'C J Halberg', CAST(0x000083FD00000000 AS DateTime), N'Female', N'6474380044', N'113 Lake Shore Drive', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (60, N'000-028-351', N'Casie L Witte', CAST(0x000083F800000000 AS DateTime), N'Female', N'4027300347', N'4620 Spruce st', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (61, N'002-835-994', N'Tami Swanson', CAST(0x000080E100000000 AS DateTime), N'Female', N'7633503833', N'8832 Blackoaks Lane N', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (62, N'020-134-376', N'Nancy J Francis', CAST(0x000080FF00000000 AS DateTime), N'Female', N'7634948588', N'18366 Gladstone Blvd', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (63, N'002-847-566', N'Ruth Slife', CAST(0x0000707E00000000 AS DateTime), N'Female', N'4057064556', N'3110 Thomas Ave. #103', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (64, N'742-004-855', N'Gina Greenleaf', CAST(0x000083D400000000 AS DateTime), N'Female', N'2676138173', N'452 Meadowbrook Drive', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (65, N'205-307-272', N'George A Jacynycz', CAST(0x0000817900000000 AS DateTime), N'Male', N'6149152652', N'6265 Craughwell Lane', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (66, N'001-393-419', N'Kathleen E Gillen', CAST(0x0000810400000000 AS DateTime), N'Female', N'3153828548', N'8 Sylvan Road', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (67, N'372-844-488', N'Quail Hjelmeir', CAST(0x00007E2700000000 AS DateTime), N'Male', N'8083391214', N'1199 NE Beacon Drive', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (68, N'102-390-023', N'Russell K Jones', CAST(0x00007A7800000000 AS DateTime), N'Male', N'4013979097', N'24 Grenridge Ct', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (69, N'011-029-333', N'ALEXANDER BILLARD', CAST(0x0000788200000000 AS DateTime), N'Male', N'9028760310', N'31hamilton street', N'Enable', NULL)
INSERT [dbo].[Customer] ([Customer_ID], [ID_Card_No], [Customer_FullName], [Customer_DoB], [Customer_Gender], [Customer_Phone], [Customer_Address], [Customer_Status], [Customer_Status_Reason]) VALUES (70, N'205-753-072', N'Vuong Nguyen', CAST(0x00007B3300000000 AS DateTime), N'Male', N'0919515780', N'280 Truong Chinh', N'Enable', NULL)
/****** Object:  Table [dbo].[Currency]    Script Date: 10/03/2013 09:55:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Currency](
	[Currency_ID] [int] NOT NULL,
	[Currency_Symbol] [varchar](5) NULL,
	[Currency_Name] [varchar](30) NULL,
	[Exchange_Rate] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[Currency_ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Currency] ([Currency_ID], [Currency_Symbol], [Currency_Name], [Exchange_Rate]) VALUES (1, N'$', N'Dollar', 20)
INSERT [dbo].[Currency] ([Currency_ID], [Currency_Symbol], [Currency_Name], [Exchange_Rate]) VALUES (2, N'VND', N'Viet Nam Dong', 1)
/****** Object:  Table [dbo].[BankInfo]    Script Date: 10/03/2013 09:55:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[BankInfo](
	[Bank_ID] [int] NOT NULL,
	[Bank_Name] [varchar](40) NOT NULL,
	[Bank_Address] [varchar](300) NOT NULL,
	[Bank_Phone] [varchar](15) NULL,
	[Bank_Fax] [varchar](15) NULL,
PRIMARY KEY CLUSTERED 
(
	[Bank_ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[BankInfo] ([Bank_ID], [Bank_Name], [Bank_Address], [Bank_Phone], [Bank_Fax]) VALUES (1, N'G4Bank', N'Batch102A-Team4', N'0123456789', N'0123456789')
/****** Object:  Table [dbo].[Account]    Script Date: 10/03/2013 09:55:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Account](
	[Acc_ID] [int] NOT NULL,
	[Customer_ID] [int] NULL,
	[Acc_No] [varchar](19) NULL,
	[Acc_PIN] [varchar](40) NOT NULL,
	[Acc_Balance] [float] NOT NULL,
	[Currency_ID] [int] NULL,
	[Acc_Status] [varchar](15) NULL,
	[Acc_Status_Reason] [varchar](300) NULL,
PRIMARY KEY CLUSTERED 
(
	[Acc_ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[Acc_No] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (1, 5, N'1111-1111-1111-1111', N'1111', 9800, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (2, 6, N'8475-0742-2506-4068', N'0440', 45272, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (3, 7, N'5840-1294-9647-5098', N'8395', 201000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (4, 8, N'8388-1018-2383-5666', N'5668', -1000, 1, N'Disable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (5, 9, N'7509-4061-6454-8207', N'9120', 10000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (6, 22, N'3681-8937-5601-6313', N'7336', 10000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (7, 17, N'8767-3131-6422-3702', N'7561', 9500, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (8, 21, N'5221-7862-1480-9371', N'1985', 10000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (9, 20, N'6597-7366-8961-9418', N'5850', 20000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (10, 19, N'1900-7863-4063-5401', N'6097', 500000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (11, 18, N'3261-8521-2168-5941', N'2465', 2100, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (12, 17, N'8089-3647-4311-6032', N'0745', 12000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (13, 16, N'0362-2375-2447-8968', N'4673', 25720, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (14, 15, N'4920-7916-4958-5812', N'3438', 14000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (15, 15, N'1402-9390-7641-2395', N'7444', 50000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (16, 13, N'1138-7614-6834-5491', N'1308', 22200, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (17, 12, N'4530-9823-7630-3154', N'2404', 12000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (18, 11, N'5929-9188-7551-3882', N'1077', 2000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (19, 10, N'8835-7135-3253-3359', N'4551', 100000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (20, 10, N'1615-1158-2583-7783', N'8369', 100000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (21, 8, N'7420-8537-4232-5798', N'8369', 19000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (22, 7, N'0662-3044-7158-8342', N'8006', 84000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (23, 6, N'2818-0410-5515-8211', N'1931', 100000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (24, 5, N'0726-3673-5270-9449', N'6858', 8000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (25, 23, N'1571-8743-0588-3437', N'8351', 20000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (26, 24, N'1310-8693-6903-8134', N'3725', 1000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (27, 25, N'3250-8857-3062-6132', N'3838', 30000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (28, 26, N'2025-4932-8163-5878', N'3062', 42330, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (29, 27, N'4236-9671-3624-6374', N'5211', 18000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (30, 28, N'3955-3331-6217-5883', N'4002', 45000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (31, 29, N'1625-4958-4639-7010', N'9291', 8120, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (32, 30, N'9382-5518-4595-1625', N'1198', 3430, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (33, 31, N'5618-9438-5359-5980', N'5088', 2300, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (34, 32, N'6687-1884-5999-9625', N'9912', 500, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (35, 33, N'8517-6060-7110-9897', N'2524', 6000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (36, 34, N'3489-8096-9468-3064', N'8142', 20000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (37, 35, N'2523-3586-9159-9455', N'3948', 16000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (38, 36, N'1550-4836-2550-1535', N'3468', 1250, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (39, 37, N'6373-9798-0984-3454', N'4556', 8200, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (40, 38, N'7486-6225-5629-8754', N'7099', 9000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (41, 39, N'8479-9146-4618-9431', N'5953', 73080, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (42, 40, N'4557-7477-1759-2054', N'0075', 920, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (43, 41, N'6996-9301-7302-5831', N'8335', 3400, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (44, 42, N'1764-0974-3575-4266', N'9542', 34000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (45, 43, N'5298-4496-4754-2274', N'4266', 2300, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (46, 44, N'5811-2951-4745-0629', N'8258', 33410, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (47, 45, N'9673-0869-1772-5941', N'4810', 38300, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (48, 46, N'9118-7427-9141-2986', N'2449', 34333, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (49, 47, N'7096-0710-4695-9220', N'3791', 200000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (50, 48, N'2186-3244-2357-8748', N'9780', 48000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (51, 49, N'3949-9383-4554-1627', N'2127', 90000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (52, 50, N'0080-1015-8597-1484', N'1344', 89000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (53, 51, N'4000-8393-5719-5753', N'3358', 72320, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (54, 52, N'9133-6212-3587-3911', N'2227', 7103, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (55, 53, N'8255-5938-7222-2135', N'0255', 5000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (56, 54, N'6305-0899-0698-4736', N'7348', 6000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (57, 55, N'9036-1880-0427-8068', N'0401', 7200, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (58, 56, N'5663-1905-1366-2909', N'1117', 348989, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (59, 57, N'1344-3885-5542-4564', N'8028', 75002, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (60, 58, N'7579-2211-2870-7157', N'9736', 823045, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (61, 59, N'5888-3218-7491-3874', N'0500', 7033, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (62, 60, N'8217-5588-4029-3599', N'8908', 9402, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (63, 61, N'4667-2685-9753-1475', N'2158', 8000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (64, 62, N'6154-5317-8482-0566', N'5336', 619990, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (65, 63, N'6320-8817-5098-5730', N'8506', 830, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (66, 64, N'6807-4634-9165-0162', N'2639', 86110, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (67, 65, N'6879-1361-4936-1878', N'3679', 49000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (68, 66, N'6981-1129-6181-6464', N'0222', 12000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (69, 67, N'8390-4874-7607-8265', N'2844', 45000, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (70, 68, N'4259-0150-8835-3991', N'2754', 33333, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (71, 69, N'6110-2853-6380-3712', N'4753', 74222, 1, N'Enable', NULL)
INSERT [dbo].[Account] ([Acc_ID], [Customer_ID], [Acc_No], [Acc_PIN], [Acc_Balance], [Currency_ID], [Acc_Status], [Acc_Status_Reason]) VALUES (72, 70, N'7998-8034-5820-8894', N'8451', 1000000, 1, N'Enable', NULL)
/****** Object:  Table [dbo].[SystemUser]    Script Date: 10/03/2013 09:55:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SystemUser](
	[User_ID] [int] NOT NULL,
	[Group_Id] [int] NULL,
	[User_Username] [varchar](16) NOT NULL,
	[User_Password] [varchar](40) NOT NULL,
	[User_FullName] [varchar](40) NULL,
	[User_DoB] [datetime] NULL,
	[User_Gender] [varchar](15) NULL,
	[User_Address] [varchar](300) NULL,
	[User_Phone] [varchar](15) NULL,
	[User_Email] [varchar](40) NULL,
	[User_Status] [varchar](15) NOT NULL,
	[User_Status_Reason] [varchar](300) NULL,
PRIMARY KEY CLUSTERED 
(
	[User_ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[User_Username] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[SystemUser] ([User_ID], [Group_Id], [User_Username], [User_Password], [User_FullName], [User_DoB], [User_Gender], [User_Address], [User_Phone], [User_Email], [User_Status], [User_Status_Reason]) VALUES (1, 1, N'admin           ', N'e10adc3949ba59abbe56e057f20f883e', N'System', CAST(0x00007EFB00000000 AS DateTime), N'Male', N'15 Quang Trung', N'051131080', N'group4@gmail.com', N'Enable', NULL)
INSERT [dbo].[SystemUser] ([User_ID], [Group_Id], [User_Username], [User_Password], [User_FullName], [User_DoB], [User_Gender], [User_Address], [User_Phone], [User_Email], [User_Status], [User_Status_Reason]) VALUES (2, 2, N'bindizz', N'e10adc3949ba59abbe56e057f20f883e', N'bindizz', CAST(0x0000A23001413F33 AS DateTime), N'Male', N'15 Quang Trung', N'123456789', N'bindizz@gmail.com', N'Enable', N'sdfsdf')
INSERT [dbo].[SystemUser] ([User_ID], [Group_Id], [User_Username], [User_Password], [User_FullName], [User_DoB], [User_Gender], [User_Address], [User_Phone], [User_Email], [User_Status], [User_Status_Reason]) VALUES (3, 1, N'mrvuong', N'e10adc3949ba59abbe56e057f20f883e', N'Nguyen Minh Vuong', CAST(0x00007B3300000000 AS DateTime), N'Male', N'280 Truong Chinh', N'0919515780', N'vuongnm@hey.com.vn', N'Enable', NULL)
INSERT [dbo].[SystemUser] ([User_ID], [Group_Id], [User_Username], [User_Password], [User_FullName], [User_DoB], [User_Gender], [User_Address], [User_Phone], [User_Email], [User_Status], [User_Status_Reason]) VALUES (4, 1, N'mrxuan', N'e10adc3949ba59abbe56e057f20f883e', N'Nguyen Van Xuan', CAST(0x00007B3300000000 AS DateTime), N'Male', N'123 Nguyen Trai', N'0122839010', N'xuannguyen@Gmai.com', N'Enable', NULL)
INSERT [dbo].[SystemUser] ([User_ID], [Group_Id], [User_Username], [User_Password], [User_FullName], [User_DoB], [User_Gender], [User_Address], [User_Phone], [User_Email], [User_Status], [User_Status_Reason]) VALUES (5, 1, N'mrhoang', N'e10adc3949ba59abbe56e057f20f883e', N'Nguyen Van Hoang', CAST(0x0000818E00000000 AS DateTime), N'Male', N'123 Hoang Dieu', N'0982919191', N'hoangn@gmail.com', N'Enable', NULL)
INSERT [dbo].[SystemUser] ([User_ID], [Group_Id], [User_Username], [User_Password], [User_FullName], [User_DoB], [User_Gender], [User_Address], [User_Phone], [User_Email], [User_Status], [User_Status_Reason]) VALUES (6, 2, N'vuongnm', N'e10adc3949ba59abbe56e057f20f883e', N'Nguyen Minh Vuong', CAST(0x00007BD200000000 AS DateTime), N'Male', N'12 Van Cao', N'0969445668', N'vuongnm@me.com', N'Enable', NULL)
INSERT [dbo].[SystemUser] ([User_ID], [Group_Id], [User_Username], [User_Password], [User_FullName], [User_DoB], [User_Gender], [User_Address], [User_Phone], [User_Email], [User_Status], [User_Status_Reason]) VALUES (7, 2, N'aptech', N'e10adc3949ba59abbe56e057f20f883e', N'Aptech Softech', CAST(0x00009F7B00000000 AS DateTime), N'Male', N'15 Quang Trung', N'05113838781', N'aptech@softech.vn', N'Enable', NULL)
INSERT [dbo].[SystemUser] ([User_ID], [Group_Id], [User_Username], [User_Password], [User_FullName], [User_DoB], [User_Gender], [User_Address], [User_Phone], [User_Email], [User_Status], [User_Status_Reason]) VALUES (8, 2, N'canhkm', N'e10adc3949ba59abbe56e057f20f883e', N'Kieu Minh Canh', CAST(0x00009F7B00000000 AS DateTime), N'Male', N'15 Quang Trung', N'0905999999', N'canhkm@softech.vn', N'Enable', NULL)
INSERT [dbo].[SystemUser] ([User_ID], [Group_Id], [User_Username], [User_Password], [User_FullName], [User_DoB], [User_Gender], [User_Address], [User_Phone], [User_Email], [User_Status], [User_Status_Reason]) VALUES (9, 1, N'mrkhoa', N'e10adc3949ba59abbe56e057f20f883e', N'Doan Ngoc Van Khoa', CAST(0x00007E2800000000 AS DateTime), N'Male', N'111 Dien Bien Phu', N'0919822831', N'khoadk@gmail.com', N'Enable', NULL)
/****** Object:  Table [dbo].[CustomerTransaction]    Script Date: 10/03/2013 09:55:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[CustomerTransaction](
	[Tran_ID] [int] NOT NULL,
	[Tran_Type] [varchar](15) NOT NULL,
	[Acc_ID] [int] NULL,
	[Admin_ID] [int] NULL,
	[Tran_Amount] [float] NOT NULL,
	[Tran_Balance] [float] NOT NULL,
	[Tran_Reason] [varchar](max) NULL,
	[Tran_Date] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[Tran_ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[CustomerTransaction] ([Tran_ID], [Tran_Type], [Acc_ID], [Admin_ID], [Tran_Amount], [Tran_Balance], [Tran_Reason], [Tran_Date]) VALUES (1, N'Withdraw', 17, NULL, 1000, 17000, NULL, CAST(0x0000A24B00BDB1B4 AS DateTime))
INSERT [dbo].[CustomerTransaction] ([Tran_ID], [Tran_Type], [Acc_ID], [Admin_ID], [Tran_Amount], [Tran_Balance], [Tran_Reason], [Tran_Date]) VALUES (2, N'Withdraw', 17, NULL, 5000, 7000, NULL, CAST(0x0000A24B00BE542D AS DateTime))
INSERT [dbo].[CustomerTransaction] ([Tran_ID], [Tran_Type], [Acc_ID], [Admin_ID], [Tran_Amount], [Tran_Balance], [Tran_Reason], [Tran_Date]) VALUES (3, N'Deposit', 5, NULL, 5000, 15000, NULL, CAST(0x0000A24B00BE542F AS DateTime))
INSERT [dbo].[CustomerTransaction] ([Tran_ID], [Tran_Type], [Acc_ID], [Admin_ID], [Tran_Amount], [Tran_Balance], [Tran_Reason], [Tran_Date]) VALUES (4, N'Withdraw', 13, NULL, 1000, 14000, NULL, CAST(0x0000A24B012723E7 AS DateTime))
INSERT [dbo].[CustomerTransaction] ([Tran_ID], [Tran_Type], [Acc_ID], [Admin_ID], [Tran_Amount], [Tran_Balance], [Tran_Reason], [Tran_Date]) VALUES (5, N'Deposit', 13, NULL, 8000, 22000, NULL, CAST(0x0000A24B012734BC AS DateTime))
INSERT [dbo].[CustomerTransaction] ([Tran_ID], [Tran_Type], [Acc_ID], [Admin_ID], [Tran_Amount], [Tran_Balance], [Tran_Reason], [Tran_Date]) VALUES (6, N'Withdraw', 13, NULL, 1000, 21000, NULL, CAST(0x0000A24B0136DDBC AS DateTime))
INSERT [dbo].[CustomerTransaction] ([Tran_ID], [Tran_Type], [Acc_ID], [Admin_ID], [Tran_Amount], [Tran_Balance], [Tran_Reason], [Tran_Date]) VALUES (7, N'Deposit', 13, NULL, 5220, 26220, NULL, CAST(0x0000A24B0136E970 AS DateTime))
INSERT [dbo].[CustomerTransaction] ([Tran_ID], [Tran_Type], [Acc_ID], [Admin_ID], [Tran_Amount], [Tran_Balance], [Tran_Reason], [Tran_Date]) VALUES (8, N'Withdraw', 13, NULL, 500, 25220, NULL, CAST(0x0000A24B0138262B AS DateTime))
INSERT [dbo].[CustomerTransaction] ([Tran_ID], [Tran_Type], [Acc_ID], [Admin_ID], [Tran_Amount], [Tran_Balance], [Tran_Reason], [Tran_Date]) VALUES (9, N'Deposit', 7, NULL, 500, 10000, NULL, CAST(0x0000A24B0138262D AS DateTime))
INSERT [dbo].[CustomerTransaction] ([Tran_ID], [Tran_Type], [Acc_ID], [Admin_ID], [Tran_Amount], [Tran_Balance], [Tran_Reason], [Tran_Date]) VALUES (10, N'Withdraw', 1, NULL, 1990, 10000, NULL, CAST(0x0000A24B01440C29 AS DateTime))
INSERT [dbo].[CustomerTransaction] ([Tran_ID], [Tran_Type], [Acc_ID], [Admin_ID], [Tran_Amount], [Tran_Balance], [Tran_Reason], [Tran_Date]) VALUES (11, N'Withdraw', 1, NULL, 200, 9600, NULL, CAST(0x0000A24C00979493 AS DateTime))
INSERT [dbo].[CustomerTransaction] ([Tran_ID], [Tran_Type], [Acc_ID], [Admin_ID], [Tran_Amount], [Tran_Balance], [Tran_Reason], [Tran_Date]) VALUES (12, N'Deposit', 16, NULL, 200, 22400, NULL, CAST(0x0000A24C00979496 AS DateTime))
/****** Object:  Table [dbo].[Transfer]    Script Date: 10/03/2013 09:55:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Transfer](
	[Transfer_ID] [int] NOT NULL,
	[Acc_from] [int] NOT NULL,
	[Acc_to] [int] NOT NULL,
	[Amount] [float] NOT NULL,
	[Transaction_from_ID] [int] NOT NULL,
	[Transaction_to_ID] [int] NOT NULL,
	[Transfer_date] [datetime] NOT NULL,
	[Admin_ID] [int] NULL,
 CONSTRAINT [PK_Transfer] PRIMARY KEY CLUSTERED 
(
	[Transfer_ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Transfer] ([Transfer_ID], [Acc_from], [Acc_to], [Amount], [Transaction_from_ID], [Transaction_to_ID], [Transfer_date], [Admin_ID]) VALUES (1, 13, 7, 500, 8, 9, CAST(0x0000A24B0138262E AS DateTime), NULL)
INSERT [dbo].[Transfer] ([Transfer_ID], [Acc_from], [Acc_to], [Amount], [Transaction_from_ID], [Transaction_to_ID], [Transfer_date], [Admin_ID]) VALUES (2, 1, 16, 200, 11, 12, CAST(0x0000A24C00979497 AS DateTime), NULL)
/****** Object:  Default [DF__CustomerT__Tran___22AA2996]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[CustomerTransaction] ADD  DEFAULT (getdate()) FOR [Tran_Date]
GO
/****** Object:  ForeignKey [FK__Account__Currenc__239E4DCF]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Account]  WITH CHECK ADD FOREIGN KEY([Currency_ID])
REFERENCES [dbo].[Currency] ([Currency_ID])
GO
/****** Object:  ForeignKey [FK_Account_Customer]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Account]  WITH CHECK ADD  CONSTRAINT [FK_Account_Customer] FOREIGN KEY([Customer_ID])
REFERENCES [dbo].[Customer] ([Customer_ID])
GO
ALTER TABLE [dbo].[Account] CHECK CONSTRAINT [FK_Account_Customer]
GO
/****** Object:  ForeignKey [FK1D0C220D33835DD6]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Account]  WITH CHECK ADD  CONSTRAINT [FK1D0C220D33835DD6] FOREIGN KEY([Customer_ID])
REFERENCES [dbo].[Customer] ([Customer_ID])
GO
ALTER TABLE [dbo].[Account] CHECK CONSTRAINT [FK1D0C220D33835DD6]
GO
/****** Object:  ForeignKey [FK1D0C220D53A71371]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Account]  WITH CHECK ADD  CONSTRAINT [FK1D0C220D53A71371] FOREIGN KEY([Customer_ID])
REFERENCES [dbo].[Customer] ([Customer_ID])
GO
ALTER TABLE [dbo].[Account] CHECK CONSTRAINT [FK1D0C220D53A71371]
GO
/****** Object:  ForeignKey [FK1D0C220D740AD357]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Account]  WITH CHECK ADD  CONSTRAINT [FK1D0C220D740AD357] FOREIGN KEY([Currency_ID])
REFERENCES [dbo].[Currency] ([Currency_ID])
GO
ALTER TABLE [dbo].[Account] CHECK CONSTRAINT [FK1D0C220D740AD357]
GO
/****** Object:  ForeignKey [FK1D0C220DBE448CF6]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Account]  WITH CHECK ADD  CONSTRAINT [FK1D0C220DBE448CF6] FOREIGN KEY([Currency_ID])
REFERENCES [dbo].[Currency] ([Currency_ID])
GO
ALTER TABLE [dbo].[Account] CHECK CONSTRAINT [FK1D0C220DBE448CF6]
GO
/****** Object:  ForeignKey [FK1D0C220DDE684291]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Account]  WITH CHECK ADD  CONSTRAINT [FK1D0C220DDE684291] FOREIGN KEY([Currency_ID])
REFERENCES [dbo].[Currency] ([Currency_ID])
GO
ALTER TABLE [dbo].[Account] CHECK CONSTRAINT [FK1D0C220DDE684291]
GO
/****** Object:  ForeignKey [FK1D0C220DE949A437]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Account]  WITH CHECK ADD  CONSTRAINT [FK1D0C220DE949A437] FOREIGN KEY([Customer_ID])
REFERENCES [dbo].[Customer] ([Customer_ID])
GO
ALTER TABLE [dbo].[Account] CHECK CONSTRAINT [FK1D0C220DE949A437]
GO
/****** Object:  ForeignKey [FK__SystemUse__Group__32E0915F]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[SystemUser]  WITH CHECK ADD FOREIGN KEY([Group_Id])
REFERENCES [dbo].[User_Group] ([Group_Id])
GO
/****** Object:  ForeignKey [FK9D23FEBABC95F0B8]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[SystemUser]  WITH CHECK ADD  CONSTRAINT [FK9D23FEBABC95F0B8] FOREIGN KEY([Group_Id])
REFERENCES [dbo].[User_Group] ([Group_Id])
GO
ALTER TABLE [dbo].[SystemUser] CHECK CONSTRAINT [FK9D23FEBABC95F0B8]
GO
/****** Object:  ForeignKey [FK9D23FEBAD842F2F3]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[SystemUser]  WITH CHECK ADD  CONSTRAINT [FK9D23FEBAD842F2F3] FOREIGN KEY([Group_Id])
REFERENCES [dbo].[User_Group] ([Group_Id])
GO
ALTER TABLE [dbo].[SystemUser] CHECK CONSTRAINT [FK9D23FEBAD842F2F3]
GO
/****** Object:  ForeignKey [FK9D23FEBADB4578B2]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[SystemUser]  WITH CHECK ADD  CONSTRAINT [FK9D23FEBADB4578B2] FOREIGN KEY([Group_Id])
REFERENCES [dbo].[User_Group] ([Group_Id])
GO
ALTER TABLE [dbo].[SystemUser] CHECK CONSTRAINT [FK9D23FEBADB4578B2]
GO
/****** Object:  ForeignKey [FK__CustomerT__Acc_I__2B3F6F97]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[CustomerTransaction]  WITH CHECK ADD FOREIGN KEY([Acc_ID])
REFERENCES [dbo].[Account] ([Acc_ID])
GO
/****** Object:  ForeignKey [FK__CustomerT__Admin__2C3393D0]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[CustomerTransaction]  WITH CHECK ADD FOREIGN KEY([Admin_ID])
REFERENCES [dbo].[SystemUser] ([User_ID])
GO
/****** Object:  ForeignKey [FKA814CC002ABB3481]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[CustomerTransaction]  WITH CHECK ADD  CONSTRAINT [FKA814CC002ABB3481] FOREIGN KEY([Admin_ID])
REFERENCES [dbo].[SystemUser] ([User_ID])
GO
ALTER TABLE [dbo].[CustomerTransaction] CHECK CONSTRAINT [FKA814CC002ABB3481]
GO
/****** Object:  ForeignKey [FKA814CC003D3324E9]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[CustomerTransaction]  WITH CHECK ADD  CONSTRAINT [FKA814CC003D3324E9] FOREIGN KEY([Acc_ID])
REFERENCES [dbo].[Account] ([Acc_ID])
GO
ALTER TABLE [dbo].[CustomerTransaction] CHECK CONSTRAINT [FKA814CC003D3324E9]
GO
/****** Object:  ForeignKey [FKA814CC00501C3B6A]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[CustomerTransaction]  WITH CHECK ADD  CONSTRAINT [FKA814CC00501C3B6A] FOREIGN KEY([Acc_ID])
REFERENCES [dbo].[Account] ([Acc_ID])
GO
ALTER TABLE [dbo].[CustomerTransaction] CHECK CONSTRAINT [FKA814CC00501C3B6A]
GO
/****** Object:  ForeignKey [FKA814CC00722DE66F]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[CustomerTransaction]  WITH CHECK ADD  CONSTRAINT [FKA814CC00722DE66F] FOREIGN KEY([Acc_ID])
REFERENCES [dbo].[Account] ([Acc_ID])
GO
ALTER TABLE [dbo].[CustomerTransaction] CHECK CONSTRAINT [FKA814CC00722DE66F]
GO
/****** Object:  ForeignKey [FKA814CC00880966A2]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[CustomerTransaction]  WITH CHECK ADD  CONSTRAINT [FKA814CC00880966A2] FOREIGN KEY([Admin_ID])
REFERENCES [dbo].[SystemUser] ([User_ID])
GO
ALTER TABLE [dbo].[CustomerTransaction] CHECK CONSTRAINT [FKA814CC00880966A2]
GO
/****** Object:  ForeignKey [FKA814CC00D0C7EF5C]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[CustomerTransaction]  WITH CHECK ADD  CONSTRAINT [FKA814CC00D0C7EF5C] FOREIGN KEY([Admin_ID])
REFERENCES [dbo].[SystemUser] ([User_ID])
GO
ALTER TABLE [dbo].[CustomerTransaction] CHECK CONSTRAINT [FKA814CC00D0C7EF5C]
GO
/****** Object:  ForeignKey [FK_Transfer_Account]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK_Transfer_Account] FOREIGN KEY([Acc_from])
REFERENCES [dbo].[Account] ([Acc_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK_Transfer_Account]
GO
/****** Object:  ForeignKey [FK_Transfer_Account1]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK_Transfer_Account1] FOREIGN KEY([Transfer_ID])
REFERENCES [dbo].[Account] ([Acc_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK_Transfer_Account1]
GO
/****** Object:  ForeignKey [FK_Transfer_CustomerTransaction]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK_Transfer_CustomerTransaction] FOREIGN KEY([Transaction_from_ID])
REFERENCES [dbo].[CustomerTransaction] ([Tran_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK_Transfer_CustomerTransaction]
GO
/****** Object:  ForeignKey [FK_Transfer_CustomerTransaction1]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK_Transfer_CustomerTransaction1] FOREIGN KEY([Transaction_to_ID])
REFERENCES [dbo].[CustomerTransaction] ([Tran_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK_Transfer_CustomerTransaction1]
GO
/****** Object:  ForeignKey [FK_Transfer_SystemUser]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK_Transfer_SystemUser] FOREIGN KEY([Admin_ID])
REFERENCES [dbo].[SystemUser] ([User_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK_Transfer_SystemUser]
GO
/****** Object:  ForeignKey [FK50331C0B11C107F8]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK50331C0B11C107F8] FOREIGN KEY([Acc_from])
REFERENCES [dbo].[Account] ([Acc_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK50331C0B11C107F8]
GO
/****** Object:  ForeignKey [FK50331C0B1A4FB53F]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK50331C0B1A4FB53F] FOREIGN KEY([Transfer_ID])
REFERENCES [dbo].[Account] ([Acc_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK50331C0B1A4FB53F]
GO
/****** Object:  ForeignKey [FK50331C0B2397BF33]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK50331C0B2397BF33] FOREIGN KEY([Transaction_from_ID])
REFERENCES [dbo].[CustomerTransaction] ([Tran_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK50331C0B2397BF33]
GO
/****** Object:  ForeignKey [FK50331C0B24AA1E79]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK50331C0B24AA1E79] FOREIGN KEY([Acc_from])
REFERENCES [dbo].[Account] ([Acc_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK50331C0B24AA1E79]
GO
/****** Object:  ForeignKey [FK50331C0B2ABB3481]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK50331C0B2ABB3481] FOREIGN KEY([Admin_ID])
REFERENCES [dbo].[SystemUser] ([User_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK50331C0B2ABB3481]
GO
/****** Object:  ForeignKey [FK50331C0B2D38CBC0]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK50331C0B2D38CBC0] FOREIGN KEY([Transfer_ID])
REFERENCES [dbo].[Account] ([Acc_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK50331C0B2D38CBC0]
GO
/****** Object:  ForeignKey [FK50331C0B46BBC97E]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK50331C0B46BBC97E] FOREIGN KEY([Acc_from])
REFERENCES [dbo].[Account] ([Acc_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK50331C0B46BBC97E]
GO
/****** Object:  ForeignKey [FK50331C0B4F4A76C5]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK50331C0B4F4A76C5] FOREIGN KEY([Transfer_ID])
REFERENCES [dbo].[Account] ([Acc_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK50331C0B4F4A76C5]
GO
/****** Object:  ForeignKey [FK50331C0B61050981]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK50331C0B61050981] FOREIGN KEY([Transaction_to_ID])
REFERENCES [dbo].[CustomerTransaction] ([Tran_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK50331C0B61050981]
GO
/****** Object:  ForeignKey [FK50331C0B880966A2]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK50331C0B880966A2] FOREIGN KEY([Admin_ID])
REFERENCES [dbo].[SystemUser] ([User_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK50331C0B880966A2]
GO
/****** Object:  ForeignKey [FK50331C0B8F7BB207]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK50331C0B8F7BB207] FOREIGN KEY([Transaction_to_ID])
REFERENCES [dbo].[CustomerTransaction] ([Tran_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK50331C0B8F7BB207]
GO
/****** Object:  ForeignKey [FK50331C0BB3996232]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK50331C0BB3996232] FOREIGN KEY([Transaction_from_ID])
REFERENCES [dbo].[CustomerTransaction] ([Tran_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK50331C0BB3996232]
GO
/****** Object:  ForeignKey [FK50331C0BD0C7EF5C]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK50331C0BD0C7EF5C] FOREIGN KEY([Admin_ID])
REFERENCES [dbo].[SystemUser] ([User_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK50331C0BD0C7EF5C]
GO
/****** Object:  ForeignKey [FK50331C0BD1036682]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK50331C0BD1036682] FOREIGN KEY([Transaction_to_ID])
REFERENCES [dbo].[CustomerTransaction] ([Tran_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK50331C0BD1036682]
GO
/****** Object:  ForeignKey [FK50331C0BE2100AB8]    Script Date: 10/03/2013 09:55:24 ******/
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK50331C0BE2100AB8] FOREIGN KEY([Transaction_from_ID])
REFERENCES [dbo].[CustomerTransaction] ([Tran_ID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK50331C0BE2100AB8]
GO
