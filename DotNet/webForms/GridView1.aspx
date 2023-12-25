<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="GridView1.aspx.cs" Inherits="File_work.GridView1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h1>Book Info</h1>
            <asp:GridView ID="gvBooks" runat="server" AutoGenerateColumns="false">
                <Columns>
                    <asp:BoundField DataField="Title" HeaderText="Title" />
                    <asp:BoundField DataField="Author" HeaderText="Author" />
                    <asp:BoundField DataField="Type" HeaderText="Type" />
                    <asp:BoundField DataField="Price" HeaderText="Price" />
                    <asp:BoundField DataField="Publisher" HeaderText="Publisher" />
                </Columns>
            </asp:GridView>
        </div>
    </form>
</body>
</html>
