<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Registration.aspx.cs" Inherits="File_work.Registration" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <center>
        <h1>User</h1>
        <h1>Registration</h1>
        <form id="form1" runat="server">
            <table>
                <tr>
                    <td>
                        <p>Name</p>
                    </td>
                    <td>
                        <asp:TextBox ID="txtName" runat="server"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Email</p>
                    </td>
                    <td>
                        <asp:TextBox ID="txtEmail" runat="server" TextMode="Email"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Password</p>
                    </td>
                    <td>
                        <asp:TextBox ID="txtPassword" runat="server" TextMode="Password"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Contact</p>
                    </td>
                    <td>
                        <asp:TextBox ID="numContact" runat="server" TextMode="Number"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>DOB</p>
                    </td>
                    <td>
                        <asp:TextBox ID="txtDob" runat="server" TextMode="date"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <center>
                            <asp:Button ID="btnSubmit" runat="server" Text="Submit" />
                        </center>
                    </td>
                </tr>
            </table>
        </form>
    </center>

</body>
</html>
