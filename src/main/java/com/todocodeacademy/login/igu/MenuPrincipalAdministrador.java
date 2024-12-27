package com.todocodeacademy.login.igu;

import com.todocodeacademy.login.logica.Categorias;
import com.todocodeacademy.login.logica.Clientes;
import com.todocodeacademy.login.logica.Controladora;
import com.todocodeacademy.login.logica.Productos;
import com.todocodeacademy.login.logica.Proveedor;
import com.todocodeacademy.login.logica.Rol;
import com.todocodeacademy.login.logica.Usuario;
import com.todocodeacademy.login.logica.Venta_exitosa;
import com.todocodeacademy.login.persistencia.ControladoraPersistencia;
import java.awt.Color;
import static java.awt.SystemColor.control;
import static java.awt.SystemColor.text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JDialog;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Claudio De Jesus
 */
public class MenuPrincipalAdministrador extends javax.swing.JFrame {

    Controladora control;
    Usuario usr;
    Proveedor prov;
    int id_cliente;
    int id_producto;
    Productos prod;
    Clientes cli;

    public MenuPrincipalAdministrador(Controladora control, Usuario usr) {
        initComponents();
        this.control = control;
        this.usr = usr;
        this.prov = prov;
        this.prod = prod;
        configurarListeners();
    }

    public MenuPrincipalAdministrador() {

    }

///////////////////////////////////////////////////Eventos de las tablas////////////////////////////////////
    private void configurarListeners() {
        tblClientes.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) { // Aseguramos que no sea un cambio intermedio
                cargarDatosDesdeTabla();
            }
        });
        tblUsuarios.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && tblUsuarios.getSelectedRow() != -1) {
                cargarDatosDesdeTablaUsuario();
            }
        });

        tblProveedor.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && tblProveedor.getSelectedRow() != -1) {
                cargarDatosDesdeTablaProveedor();
            }
        });
        tblProducto.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && tblProducto.getSelectedRow() != -1) {
                cargarDatosDesdeTablaProducto();
            }
        });
        tblVenta.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && tblVenta.getSelectedRow() != -1) {
                cargarDatosVentaDesdeTabla();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelProveedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccionProveedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefonoProveedor = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtCorreoProveedor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        btnAgregarProveedor = new javax.swing.JButton();
        btnEditarProveedor = new javax.swing.JButton();
        btnBuscarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        jPanel1Inicio = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanelProductos = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoABuscar = new javax.swing.JTextField();
        btnBuscarProudcto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        btnActualizarProducto = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtMaterialProducto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDimensionProducto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtPrecioVentaProducto = new javax.swing.JTextField();
        txtPrecioCompraProducto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtStockProducto = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        txtColorProducto = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnAgregarProducto = new javax.swing.JButton();
        btnEditarProducto = new javax.swing.JButton();
        brnBorrarProducto = new javax.swing.JButton();
        btnLimpiarProducto = new javax.swing.JButton();
        jPanelClientes = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPedidoCliente = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btnActualizarCliente = new javax.swing.JButton();
        btnAgregarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        jPanelUsuarios = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        txtNombreUser = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtContraseñaUsuario = new javax.swing.JTextField();
        cmbRolUsuario = new javax.swing.JComboBox<>();
        btnAgregarUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        jPanelVentas = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        btnBuscarProductoV = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        txtCodigoVenta = new javax.swing.JTextField();
        txtNombre = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtNombreVenta = new javax.swing.JTextField();
        txtStockVenta = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtHoraVenta = new javax.swing.JTextField();
        txtFechaVenta = new javax.swing.JTextField();
        btnBuscarProductoVenta2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        txtCantidadVenta = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtTotalVenta = new javax.swing.JTextField();
        btnEliminarVenta = new javax.swing.JButton();
        btnGuardarVenta = new javax.swing.JButton();
        btnModificarVenta = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        txtNombreVendedor = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        txtNombreClienteVenta = new javax.swing.JTextField();
        btnBuscarClienteVenta = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtCambioVenta = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtTotalAPagarVenta = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtDescuentoVenta = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        btnRecibo = new javax.swing.JButton();
        btnNuevaVenta = new javax.swing.JButton();
        btnGenerarVenta = new javax.swing.JButton();
        btnImporte = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCambio = new javax.swing.JButton();
        mbMenu = new javax.swing.JMenuBar();
        jMenu1Principal = new javax.swing.JMenu();
        jMenuItemIrAlLogin = new javax.swing.JMenuItem();
        jMenuProductos = new javax.swing.JMenu();
        jMenuItemcategoria = new javax.swing.JMenuItem();
        jMenu3Proveedor = new javax.swing.JMenu();
        jMenuClientes = new javax.swing.JMenu();
        jMenuUsuarios = new javax.swing.JMenu();
        jMenu4Ventas = new javax.swing.JMenu();
        jMenu5Configuracion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelProveedor.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del proveedor"));

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setText("ID:");

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel4.setText("Nombre:");

        txtIdProveedor.setEditable(false);
        txtIdProveedor.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        txtNombreProveedor.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel5.setText("Telefono:");

        txtDireccionProveedor.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel6.setText("Dirección:");

        txtTelefonoProveedor.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel24.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel24.setText("Correo:");

        txtCorreoProveedor.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel2)))
                                    .addGap(64, 64, 64)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(txtNombreProveedor)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6)
                            .addGap(182, 182, 182)
                            .addComponent(jLabel24))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(304, 304, 304)
                            .addComponent(txtCorreoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblProveedor);

        btnAgregarProveedor.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnAgregarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/002-agregar-usuario.png"))); // NOI18N
        btnAgregarProveedor.setText("Agregar ");
        btnAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProveedorActionPerformed(evt);
            }
        });

        btnEditarProveedor.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnEditarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-usuario_1.png"))); // NOI18N
        btnEditarProveedor.setText("Editar ");
        btnEditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProveedorActionPerformed(evt);
            }
        });

        btnBuscarProveedor.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnBuscarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-buscar.png"))); // NOI18N
        btnBuscarProveedor.setText("Buscar");
        btnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedorActionPerformed(evt);
            }
        });

        btnEliminarProveedor.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-eliminar-amigo.png"))); // NOI18N
        btnEliminarProveedor.setText("Eliminar");
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminarProveedor)
                    .addComponent(btnBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProveedor))
                .addGap(95, 95, 95))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnAgregarProveedor)
                .addGap(30, 30, 30)
                .addComponent(btnEditarProveedor)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarProveedor)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarProveedor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelProveedorLayout = new javax.swing.GroupLayout(jPanelProveedor);
        jPanelProveedor.setLayout(jPanelProveedorLayout);
        jPanelProveedorLayout.setHorizontalGroup(
            jPanelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProveedorLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelProveedorLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProveedorLayout.setVerticalGroup(
            jPanelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProveedorLayout.createSequentialGroup()
                .addGroup(jPanelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProveedorLayout.createSequentialGroup()
                        .addContainerGap(44, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProveedorLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jPanel1Inicio.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1Inicio.setPreferredSize(new java.awt.Dimension(1254, 621));

        jPanel16.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1254, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1InicioLayout = new javax.swing.GroupLayout(jPanel1Inicio);
        jPanel1Inicio.setLayout(jPanel1InicioLayout);
        jPanel1InicioLayout.setHorizontalGroup(
            jPanel1InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1InicioLayout.setVerticalGroup(
            jPanel1InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelProductos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelProductosMouseClicked(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Productos"));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Buscar:");

        txtCodigoABuscar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        btnBuscarProudcto.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnBuscarProudcto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-buscar.png"))); // NOI18N
        btnBuscarProudcto.setText("Buscar");
        btnBuscarProudcto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProudctoActionPerformed(evt);
            }
        });

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblProducto);

        btnActualizarProducto.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnActualizarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/010-actualizar.png"))); // NOI18N
        btnActualizarProducto.setText("Actualizar");
        btnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodigoABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnBuscarProudcto)
                .addGap(32, 32, 32)
                .addComponent(btnActualizarProducto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscarProudcto)
                    .addComponent(btnActualizarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos producto"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setText("Codigo:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        txtCodigoProducto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel4.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 98, 30));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setText("Nombre:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        txtNombreProducto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });
        jPanel4.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 270, 30));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setText("Color:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, -1, -1));

        txtMaterialProducto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel4.add(txtMaterialProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 153, 30));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setText("Dimensión:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        txtDimensionProducto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel4.add(txtDimensionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 30));

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setText("Precio de Compra:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel18.setText("Stock:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        txtPrecioVentaProducto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtPrecioVentaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVentaProductoActionPerformed(evt);
            }
        });
        jPanel4.add(txtPrecioVentaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 120, 30));

        txtPrecioCompraProducto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel4.add(txtPrecioCompraProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 153, 30));

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel19.setText("Precio venta:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

        txtStockProducto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel4.add(txtStockProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 153, 30));

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel20.setText("Categoria:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        jPanel4.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 220, 30));

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel21.setText("Material:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, -1, -1));

        txtColorProducto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel4.add(txtColorProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 170, 30));

        btnAgregarProducto.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-disco-flexible.png"))); // NOI18N
        btnAgregarProducto.setText("Agregar");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        btnEditarProducto.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnEditarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/008-contrato.png"))); // NOI18N
        btnEditarProducto.setText("Editar");
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });

        brnBorrarProducto.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        brnBorrarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-borrar.png"))); // NOI18N
        brnBorrarProducto.setText("Borrar");
        brnBorrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnBorrarProductoActionPerformed(evt);
            }
        });

        btnLimpiarProducto.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnLimpiarProducto.setText("Limpiar");
        btnLimpiarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarProducto))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brnBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brnBorrarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelProductosLayout = new javax.swing.GroupLayout(jPanelProductos);
        jPanelProductos.setLayout(jPanelProductosLayout);
        jPanelProductosLayout.setHorizontalGroup(
            jPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelProductosLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanelProductosLayout.setVerticalGroup(
            jPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanelClientes.setBackground(new java.awt.Color(255, 255, 255));
        jPanelClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelClientesMouseClicked(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel7.setText("ID:");

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel8.setText("Nombre:");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        txtNombreCliente.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel9.setText("Telefono:");

        txtDireccionCliente.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel10.setText("Dirección:");

        txtTelefonoCliente.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel11.setText("Pedido:");

        txtPedidoCliente.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel10)))
                            .addGap(184, 184, 184)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel11))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtNombreCliente)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPedidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(txtNombreCliente))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPedidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblClientes);

        btnActualizarCliente.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnActualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-usuario_1.png"))); // NOI18N
        btnActualizarCliente.setText("Actualizar");
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });

        btnAgregarCliente.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/002-agregar-usuario.png"))); // NOI18N
        btnAgregarCliente.setText("Guardar");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-borrar-1.png"))); // NOI18N
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnBuscarCliente.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-buscar.png"))); // NOI18N
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(btnEliminarCliente)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(btnAgregarCliente)
                .addGap(29, 29, 29)
                .addComponent(btnBuscarCliente)
                .addGap(18, 18, 18)
                .addComponent(btnActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnEliminarCliente)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientesLayout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(214, 214, 214))
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanelUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jPanelUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelUsuarios.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 604, -1, -1));

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        jPanelUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 730, 193));
        jPanelUsuarios.add(txtNombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 30, 177, 33));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuarios"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel14.setText("Nombre:");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel22.setText("Contraseña:");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel23.setText("Rol:");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        txtNombreUsuario.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel6.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 39, 220, 40));

        txtContraseñaUsuario.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel6.add(txtContraseñaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 220, 40));

        jPanel6.add(cmbRolUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 220, 40));

        btnAgregarUsuario.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/010-agregar.png"))); // NOI18N
        btnAgregarUsuario.setText("Agregar ");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });
        jPanel6.add(btnAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 180, -1));

        btnEditarUsuario.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/006-editar.png"))); // NOI18N
        btnEditarUsuario.setText("Editar ");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });
        jPanel6.add(btnEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 180, 50));

        btnEliminarUsuario.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-borrar-1.png"))); // NOI18N
        btnEliminarUsuario.setText("Eliminar ");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel6.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 180, -1));

        jPanelUsuarios.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 730, 220));

        jPanelVentas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Cantidad", "Descuento", "Stock", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblVenta);
        if (tblVenta.getColumnModel().getColumnCount() > 0) {
            tblVenta.getColumnModel().getColumn(0).setResizable(false);
            tblVenta.getColumnModel().getColumn(1).setResizable(false);
            tblVenta.getColumnModel().getColumn(2).setResizable(false);
            tblVenta.getColumnModel().getColumn(3).setResizable(false);
            tblVenta.getColumnModel().getColumn(4).setResizable(false);
            tblVenta.getColumnModel().getColumn(5).setResizable(false);
            tblVenta.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanelVentas.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 900, 150));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Venta"));

        btnBuscarProductoV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarProductoV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-buscar_1.png"))); // NOI18N
        btnBuscarProductoV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoVActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 204));
        jLabel30.setText("FECHA:");

        txtCodigoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoVentaActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtNombre.setText("Nombre:");

        txtPrecioVenta.setEditable(false);
        txtPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVentaActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel31.setText("Codigo:");

        jLabel32.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel32.setText("Stock");

        jLabel34.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel34.setText("Precio:");

        txtNombreVenta.setEditable(false);
        txtNombreVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreVentaActionPerformed(evt);
            }
        });

        txtStockVenta.setEditable(false);
        txtStockVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockVentaActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 204));
        jLabel38.setText("HORA:");

        txtHoraVenta.setEditable(false);
        txtHoraVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtHoraVenta.setForeground(new java.awt.Color(0, 0, 255));
        txtHoraVenta.setBorder(null);

        txtFechaVenta.setEditable(false);
        txtFechaVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFechaVenta.setForeground(new java.awt.Color(0, 0, 255));
        txtFechaVenta.setBorder(null);

        btnBuscarProductoVenta2.setText("detalles");
        btnBuscarProductoVenta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoVenta2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(59, 59, 59)
                .addComponent(jLabel30)
                .addGap(50, 50, 50))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(jLabel32)
                        .addGap(135, 135, 135)
                        .addComponent(jLabel34))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(647, 647, 647)
                        .addComponent(txtHoraVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txtNombreVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(txtStockVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscarProductoVenta2)
                                    .addComponent(btnBuscarProductoV, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38)
                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btnBuscarProductoVenta2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarProductoV)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre)
                            .addComponent(jLabel32)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStockVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanelVentas.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 900, -1));

        jLabel33.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel33.setText("Cantidad:");

        jLabel35.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel35.setText("Total:");

        txtTotalVenta.setEditable(false);

        btnEliminarVenta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEliminarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/002-borrar-1.png"))); // NOI18N
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });

        btnGuardarVenta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnGuardarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/003-salvado.png"))); // NOI18N
        btnGuardarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVentaActionPerformed(evt);
            }
        });

        btnModificarVenta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnModificarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/006-editar.png"))); // NOI18N
        btnModificarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificarVenta)
                    .addComponent(btnEliminarVenta)
                    .addComponent(btnGuardarVenta)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        jPanelVentas.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 900, 60));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del vendedor"));

        jLabel36.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel36.setText("Nombre:");

        txtNombreVendedor.setEditable(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 69, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtNombreVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelVentas.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 280, 80));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));

        jLabel37.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel37.setText("Nombre:");

        txtNombreClienteVenta.setEditable(false);

        btnBuscarClienteVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarClienteVenta.setText("buscar");
        btnBuscarClienteVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(btnBuscarClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(txtNombreClienteVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelVentas.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 110, 280, 90));

        jLabel27.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel27.setText("Cambio:");

        jLabel42.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel42.setText("$");

        txtCambioVenta.setEditable(false);
        txtCambioVenta.setBackground(new java.awt.Color(51, 255, 51));
        txtCambioVenta.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtCambioVenta.setForeground(new java.awt.Color(0, 0, 204));
        txtCambioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCambioVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCambioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(105, 105, 105))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCambioVenta)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanelVentas.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 320, 100));

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel28.setText("Total a pagar:");

        txtTotalAPagarVenta.setEditable(false);
        txtTotalAPagarVenta.setBackground(new java.awt.Color(0, 51, 255));
        txtTotalAPagarVenta.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        txtTotalAPagarVenta.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalAPagarVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        txtTotalAPagarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAPagarVentaActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel39.setText("%");

        jLabel40.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel40.setText("Descuento:");

        txtDescuentoVenta.setText("0");
        txtDescuentoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoVentaActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel41.setText("$");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel40)
                    .addComponent(txtDescuentoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalAPagarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28)
                        .addGap(51, 51, 51))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescuentoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)
                            .addComponent(jLabel41)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalAPagarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanelVentas.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 570, 100));

        btnRecibo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnRecibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/009-impresora.png"))); // NOI18N
        btnRecibo.setText("Recibo");
        btnRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReciboActionPerformed(evt);
            }
        });

        btnNuevaVenta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/005-registro.png"))); // NOI18N
        btnNuevaVenta.setText("Nuevo");
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });

        btnGenerarVenta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnGenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/007-ventas.png"))); // NOI18N
        btnGenerarVenta.setText("Generar Venta");
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });

        btnImporte.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnImporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/008-contrato.png"))); // NOI18N
        btnImporte.setText("Importe");

        btnCancelar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/010-rechazar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");

        btnCambio.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/006-metodo-de-pago.png"))); // NOI18N
        btnCambio.setText("Cambio");
        btnCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnGenerarVenta))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRecibo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnImporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevaVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerarVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnRecibo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        jPanelVentas.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 210, 250, 320));

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 1267, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 1267, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addComponent(jPanelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addComponent(jPanelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addComponent(jPanelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 10, Short.MAX_VALUE)))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addComponent(jPanel1Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 10, Short.MAX_VALUE)))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addComponent(jPanelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE)))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addComponent(jPanelProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mbMenu.setBackground(new java.awt.Color(204, 204, 255));
        mbMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu1Principal.setBackground(new java.awt.Color(204, 204, 255));
        jMenu1Principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-casa.png"))); // NOI18N
        jMenu1Principal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItemIrAlLogin.setText("Ir al login");
        jMenuItemIrAlLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIrAlLoginActionPerformed(evt);
            }
        });
        jMenu1Principal.add(jMenuItemIrAlLogin);

        mbMenu.add(jMenu1Principal);

        jMenuProductos.setBackground(new java.awt.Color(204, 204, 255));
        jMenuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/005-cajas.png"))); // NOI18N
        jMenuProductos.setText("Productos      ");
        jMenuProductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuProductosMouseClicked(evt);
            }
        });
        jMenuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProductosActionPerformed(evt);
            }
        });

        jMenuItemcategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItemcategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/009-boton-agregar.png"))); // NOI18N
        jMenuItemcategoria.setText("Agregar categoria");
        jMenuItemcategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemcategoriaMouseClicked(evt);
            }
        });
        jMenuItemcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemcategoriaActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItemcategoria);

        mbMenu.add(jMenuProductos);

        jMenu3Proveedor.setBackground(new java.awt.Color(204, 204, 255));
        jMenu3Proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/003-agregar-usuario-1.png"))); // NOI18N
        jMenu3Proveedor.setText("Proveedor");
        jMenu3Proveedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu3Proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3ProveedorMouseClicked(evt);
            }
        });
        mbMenu.add(jMenu3Proveedor);

        jMenuClientes.setBackground(new java.awt.Color(204, 204, 255));
        jMenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/002-agregar-usuario.png"))); // NOI18N
        jMenuClientes.setText("Clientes     ");
        jMenuClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuClientesMouseClicked(evt);
            }
        });
        jMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClientesActionPerformed(evt);
            }
        });
        mbMenu.add(jMenuClientes);

        jMenuUsuarios.setBackground(new java.awt.Color(204, 204, 255));
        jMenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/008-jefe-de-equipo.png"))); // NOI18N
        jMenuUsuarios.setText("Usuario   ");
        jMenuUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuUsuariosMouseClicked(evt);
            }
        });
        jMenuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUsuariosActionPerformed(evt);
            }
        });
        mbMenu.add(jMenuUsuarios);

        jMenu4Ventas.setBackground(new java.awt.Color(204, 204, 255));
        jMenu4Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/004-bienes.png"))); // NOI18N
        jMenu4Ventas.setText("Ventas    ");
        jMenu4Ventas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu4Ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4VentasMouseClicked(evt);
            }
        });
        mbMenu.add(jMenu4Ventas);

        jMenu5Configuracion.setBackground(new java.awt.Color(204, 204, 255));
        jMenu5Configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/009-sistema-de-seguridad.png"))); // NOI18N
        jMenu5Configuracion.setText("Configuración     ");
        jMenu5Configuracion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mbMenu.add(jMenu5Configuracion);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProductosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuProductosActionPerformed

    private void jMenuProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuProductosMouseClicked
        // TODO add your handling code here:
        cambiarVista(jPanelProductos);
        cargarTablaProductos();
        actualizarComboCategoriasProductos();

    }//GEN-LAST:event_jMenuProductosMouseClicked

    private void jMenuClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuClientesMouseClicked
        // TODO add your handling code here:
        cambiarVista(jPanelClientes);
        cargarTablaClientes();


    }//GEN-LAST:event_jMenuClientesMouseClicked

    private void jMenuUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuUsuariosMouseClicked
        // TODO add your handling code here:
        cambiarVista(jPanelUsuarios);
        this.txtNombreUser.setText(usr.getNombreUsuario());

        cargarTablaUsuario();
        // Usuar.setEnabled(false);
    }//GEN-LAST:event_jMenuUsuariosMouseClicked

    private void jMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClientesActionPerformed
        // TODO add your handling code here:
        if (tblClientes.getRowCount() > 0) {
            //Controlar que se haya seleccionado un elemento
            if (tblClientes.getSelectedRow() != -1) {
                //Obtengo la id del elemento a eliminar
                int id_Cliente = Integer.parseInt(String.valueOf(tblClientes.getValueAt(tblClientes.getSelectedRow(), 0)));

                //Buscamos el id
                cli = control.traerCliente(id_Cliente);
                //cargamos datos 
                txtNombreCliente.setText(cli.getNombre());
                txtDireccionCliente.setText(cli.getDireccion());
                txtTelefonoCliente.setText(cli.getNumero());
                txtPedidoCliente.setText(cli.getPedido());

            }
        }
    }//GEN-LAST:event_jMenuClientesActionPerformed

    private void jMenuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUsuariosActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jMenuUsuariosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        cambiarVista(jPanel1Inicio);
        List<Categorias> listaCategorias = control.TraerCategoria();

        if (listaCategorias != null) {
            for (Categorias cat : listaCategorias) {
                cmbCategoria.addItem(cat.getNombre());
            }
        }

        List<Rol> listaRoles = control.traerRoles();

        if (listaRoles != null) {
            for (Rol rol : listaRoles) {
                cmbRolUsuario.addItem(rol.getNombreRol());
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void actualizarComboCategoriasProductos() {
        // Limpia el contenido actual del combo box de productos
        cmbCategoria.removeAllItems();

        // Obtener la lista de categorías desde la base de datos
        List<Categorias> listaCategorias = control.TraerCategoria();

        // Verificar que la lista no sea nula y cargar las categorías
        if (listaCategorias != null) {
            for (Categorias cat : listaCategorias) {
                cmbCategoria.addItem(cat.getNombre());
            }
        }
    }

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        // TODO add your handling code here:
        String usuario = txtNombreUsuario.getText();
        String contra = txtContraseñaUsuario.getText();
        String rol = (String) cmbRolUsuario.getSelectedItem();

        control.crearUsuario(usuario, contra, rol);

        mostrarMensaje("Usuario creado correctamente", "Info", "Creacion exitosa");
        cargarTablaUsuario();

    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed

        actualizarUsuario();
        cargarTablaUsuario();

    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        // TODO add your handling code here:
        //Que la tabla tenga elemento
        if (tblUsuarios.getRowCount() > 0) {
            //Controlar que se haya seleccionado un elemento
            if (tblUsuarios.getSelectedRow() != -1) {
                //Obtengo la id del elemento a eliminar
                int id_Usuario = Integer.parseInt(String.valueOf(tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 0)));

                //Llamamos el metodo borrar
                control.borrarUsuario(id_Usuario);

                //Avisar al usuario que se borro completamente
                mostrarMensaje("Se borro el usuario correctamente", "info", "Eliminación correctamente");
                cargarTablaUsuario();
            } else {
                mostrarMensaje("No selecciono ningun registor", "Error", "Error al borrar");
            }
        } else {
            mostrarMensaje("La tabla esta vacia", "Error", "Error al borrar");

        }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProveedorActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombreProveedor.getText();
        String direccion = txtDireccionProveedor.getText();
        String correo = txtCorreoProveedor.getText();
        String telefono = txtTelefonoProveedor.getText();

        control.crearProveedor(nombre, direccion, correo, telefono);
        mostrarMensaje("Proveedor creado correctamente", "Info", "Creacion exitosa");
        cargarTablaProveedor();


    }//GEN-LAST:event_btnAgregarProveedorActionPerformed

    private void jMenu3ProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3ProveedorMouseClicked
        // TODO add your handling code here:
        cambiarVista(jPanelProveedor);
        cargarTablaProveedor();

    }//GEN-LAST:event_jMenu3ProveedorMouseClicked

    private void btnEditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProveedorActionPerformed
        // TODO add your handling code here:
        actualizarProveedor();
        cargarTablaProveedor();


    }//GEN-LAST:event_btnEditarProveedorActionPerformed

    private void jMenu4VentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4VentasMouseClicked
        // Cambia la vista
        cambiarVista(jPanelVentas);
        this.txtNombreVendedor.setText(usr.getNombreUsuario());
        this.txtNombreClienteVenta.setText("CLIENTE PUBLICO EN GENERAL");
        // Inicia un Timer para actualizar la fecha y hora automáticamente
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date fecha = new Date();

                // Formatear fecha y hora
                SimpleDateFormat formatoFecha = new SimpleDateFormat("MM/dd/yyyy");
                SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm a"); // Formato de 12 horas con AM/PM

                // Actualiza los campos de texto
                txtFechaVenta.setText(formatoFecha.format(fecha));  // Ejemplo: 12/17/2024
                txtHoraVenta.setText(formatoHora.format(fecha));   // Ejemplo: 02:15 PM
            }
        });

        // Inicia el Timer
        timer.start();
    }//GEN-LAST:event_jMenu4VentasMouseClicked

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombreCliente.getText();
        String direccion = txtDireccionCliente.getText();
        String numero = txtTelefonoCliente.getText();
        String pedido = txtPedidoCliente.getText();

        control.crearClientes(nombre, direccion, numero, pedido);
        mostrarMensaje("Cliente creado correctamente", "Info", "Creacion exitosa");
        cargarTablaClientes();


    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        // TODO add your handling code here:
        if (tblClientes.getRowCount() > 0) {
            //Controlar que se haya seleccionado un elemento
            if (tblClientes.getSelectedRow() != -1) {
                //Obtengo la id del elemento a eliminar
                int id_Cliente = Integer.parseInt(String.valueOf(tblClientes.getValueAt(tblClientes.getSelectedRow(), 0)));

                //Llamamos el metodo borrar
                control.borrarCliente(id_Cliente);

                //Avisar al usuario que se borro completamente
                mostrarMensaje("Se borro el Cliente correctamente", "info", "Eliminación correctamente");
                cargarTablaClientes();
            } else {
                mostrarMensaje("No selecciono ningun registor", "Error", "Error al borrar");
            }
        } else {
            mostrarMensaje("La tabla esta vacia", "Error", "Error al borrar");

        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void jPanelClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelClientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelClientesMouseClicked


    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed
        actualizarCliente();
        cargarTablaClientes();

    }//GEN-LAST:event_btnActualizarClienteActionPerformed

    private void jMenuItemIrAlLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIrAlLoginActionPerformed
        // TODO add your handling code here:
        Logininicial lo = new Logininicial();
        lo.setVisible(true);
        lo.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItemIrAlLoginActionPerformed

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        // TODO add your handling code here:
        if (tblProveedor.getRowCount() > 0) {
            //Controlar que se haya seleccionado un elemento
            if (tblProveedor.getSelectedRow() != -1) {
                //Obtengo la id del elemento a eliminar
                int id_proveedor = Integer.parseInt(String.valueOf(tblProveedor.getValueAt(tblProveedor.getSelectedRow(), 0)));

                //Llamamos el metodo borrar
                control.borrarProveedor(id_proveedor);

                //Avisar al usuario que se borro completamente
                mostrarMensaje("Se borro el proveedor correctamente", "info", "Eliminación correctamente");
                cargarTablaProveedor();
            } else {
                mostrarMensaje("No selecciono ningun registor", "Error", "Error al borrar");
            }
        } else {
            mostrarMensaje("La tabla esta vacia", "Error", "Error al borrar");

        }

    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void jMenuItemcategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemcategoriaMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItemcategoriaMouseClicked

    private void jMenuItemcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemcategoriaActionPerformed
        // TODO add your handling code here:
        Categoria categ = new Categoria(control);
        categ.setVisible(true);
        categ.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItemcategoriaActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed

        JTextField[] campos = {txtCodigoProducto, txtNombreProducto, txtColorProducto, txtDimensionProducto,
            txtPrecioVentaProducto, txtStockProducto, txtPrecioCompraProducto, txtMaterialProducto};

        // Validar campos vacíos
        if (!validarCampos(campos)) {
            mostrarMensaje("Todos los campos son obligatorios", "Error", "Campos incompletos");
            return;
        }

        // Obtener valores
        String codigo = txtCodigoProducto.getText();
        String nombre = txtNombreProducto.getText();
        String color = txtColorProducto.getText();
        String dimension = txtDimensionProducto.getText();
        String material = txtMaterialProducto.getText();
        String categoria = cmbCategoria.getSelectedItem().toString(); // Obtener la categoría seleccionada

        int precioVenta, stock, precioCompra;
        try {
            precioVenta = Integer.parseInt(txtPrecioVentaProducto.getText());
            stock = Integer.parseInt(txtStockProducto.getText());
            precioCompra = Integer.parseInt(txtPrecioCompraProducto.getText());
            if (precioVenta <= 0 || stock <= 0 || precioCompra <= 0) {
                mostrarMensaje("Los valores numéricos deben ser mayores a cero", "Error", "Datos inválidos");
                return;
            }
        } catch (NumberFormatException e) {
            mostrarMensaje("Precio de venta, stock y precio de compra deben ser valores numéricos", "Error", "Datos inválidos");
            return;
        }

        // Validar que el código no exista
        if (control.existeProductoConCodigo(codigo)) {
            mostrarMensaje("El código del producto ya existe. Ingrese un código diferente", "Error", "Código duplicado");
            return;
        }

        try {
            control.crearProducto(codigo, nombre, color, dimension, precioVenta, stock, precioCompra, material, categoria);
            mostrarMensaje("Producto agregado correctamente", "Info", "Operación exitosa");
            cargarTablaProductos();
        } catch (Exception e) {
            mostrarMensaje("Error al agregar el producto: " + e.getMessage(), "Error", "Operación fallida");
        }

    }//GEN-LAST:event_btnAgregarProductoActionPerformed
    private void limpiarCamposProducto() {
        txtCodigoProducto.setText("");
        txtNombreProducto.setText("");
        cmbCategoria.setSelectedIndex(0);
        txtColorProducto.setText("");
        txtDimensionProducto.setText("");
        txtPrecioVentaProducto.setText("");
        txtStockProducto.setText("");
        txtPrecioCompraProducto.setText("");
        txtMaterialProducto.setText("");
    }
    private void brnBorrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnBorrarProductoActionPerformed
        // TODO add your handling code here:
        // Verificar si la tabla tiene datos
        if (tblProducto.getRowCount() > 0) {
            // Controlar que se haya seleccionado un elemento
            if (tblProducto.getSelectedRow() != -1) {
                // Obtener la ID del producto a eliminar
                int id_producto = Integer.parseInt(String.valueOf(tblProducto.getValueAt(tblProducto.getSelectedRow(), 0)));

                // Llamar al método borrar
                control.borrarProducto(id_producto);

                // Avisar al usuario que se eliminó correctamente
                mostrarMensaje("Se eliminó el producto correctamente", "Info", "Eliminación exitosa");
                cargarTablaProductos();
            } else {
                mostrarMensaje("No seleccionó ningún registro", "Error", "Error al eliminar");
            }
        } else {
            mostrarMensaje("La tabla está vacía", "Error", "Error al eliminar");
        }

    }//GEN-LAST:event_brnBorrarProductoActionPerformed

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
        if (tblProducto.getSelectedRow() != -1) {
            try {
                // Obtener el ID del producto seleccionado
                int id_producto = Integer.parseInt(tblProducto.getValueAt(tblProducto.getSelectedRow(), 0).toString());

                // Traer el producto desde la base de datos
                Productos producto = control.traerProducto(id_producto);

                // Validar campos numéricos
                int precioVenta, stock, precioCompra;

                // Verificar si los campos están vacíos antes de convertirlos
                String precioVentaTexto = txtPrecioVentaProducto.getText().trim();
                String stockTexto = txtStockProducto.getText().trim();
                String precioCompraTexto = txtPrecioCompraProducto.getText().trim();

                if (precioVentaTexto.isEmpty() || stockTexto.isEmpty() || precioCompraTexto.isEmpty()) {
                    mostrarMensaje("Por favor, llena todos los campos numéricos.", "Error", "Campos vacíos");
                    return; // Salir del método si hay campos vacíos
                }

                // Convertir los valores a enteros
                precioVenta = Integer.parseInt(precioVentaTexto);
                stock = Integer.parseInt(stockTexto);
                precioCompra = Integer.parseInt(precioCompraTexto);

                // Actualizar los valores del producto con los datos de los JTextField
                producto.setCodigo(txtCodigoProducto.getText().trim());
                producto.setNombre(txtNombreProducto.getText().trim());
                producto.setColor(txtColorProducto.getText().trim());
                producto.setDimension(txtDimensionProducto.getText().trim());
                producto.setPrecioVenta(precioVenta);
                producto.setStockDisponible(stock);
                producto.setPrecioCompra(precioCompra);
                producto.setMaterial(txtMaterialProducto.getText().trim());

                // Asignar la categoría seleccionada
                String categoriaSeleccionada = (String) cmbCategoria.getSelectedItem();
                Categorias categoria = control.traercat(categoriaSeleccionada);

                if (categoria != null) {
                    producto.setUnCategoria(categoria);
                } else {
                    mostrarMensaje("No se pudo encontrar la categoría seleccionada", "Error", "Categoría inválida");
                    return;
                }

                // Actualizar el producto
                control.actualizarProducto(producto);

                // Actualizar la tabla y mostrar mensaje
                cargarTablaProductos();
                mostrarMensaje("Producto editado correctamente", "Info", "Edición Exitosa");
                limpiarCamposProducto();

            } catch (NumberFormatException e) {
                mostrarMensaje("Error en los datos numéricos. Verifique los campos.", "Error", "Datos inválidos");
                System.out.println(e.toString());
            } catch (Exception e) {
                mostrarMensaje("Ocurrió un error al editar el producto: " + e.getMessage(), "Error", "Error al editar");
            }
        } else {
            mostrarMensaje("Debe seleccionar un producto de la tabla", "Error", "Sin selección");
        }
    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void jPanelProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelProductosMouseClicked
        // TODO add your handling code here:// Actualizar el combo box de categorías
        //  actualizarComboBoxCategorias();

    }//GEN-LAST:event_jPanelProductosMouseClicked

    private void txtPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVentaActionPerformed

    private void txtCodigoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoVentaActionPerformed

    private void txtCambioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCambioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCambioVentaActionPerformed

    private void txtNombreVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreVentaActionPerformed

    private void txtStockVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockVentaActionPerformed

    private void txtTotalAPagarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAPagarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAPagarVentaActionPerformed

    private void btnBuscarProductoVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoVActionPerformed
        // Obtener el texto ingresado por el usuario
        // Obtener el texto ingresado por el usuario
        String textoBusqueda = txtCodigoVenta.getText().trim();

        // Verificar que el campo no esté vacío
        if (textoBusqueda.isEmpty()) {
            mostrarMensaje("Debe ingresar un código de producto.", "Error", "Campo vacío");
            return;
        }

        // Buscar el producto por código
        Productos producto = control.buscarProductoPorCodigo(textoBusqueda);

        // Verificar si el producto existe
        if (producto != null) {
            // Llenar los JTextField con los datos del producto
            txtNombreVenta.setText(producto.getNombre());
            txtStockVenta.setText(String.valueOf(producto.getStockDisponible()));
            txtPrecioVenta.setText(String.valueOf(producto.getPrecioVenta()));
        } else {
            // Mostrar mensaje si no se encuentra el producto
            mostrarMensaje("Producto no encontrado. Verifique el código ingresado.", "Error", "Producto no encontrado");

            // Limpiar los campos
            txtNombreVenta.setText("");
            txtStockVenta.setText("");
            txtPrecioVenta.setText("");
        }

    }//GEN-LAST:event_btnBuscarProductoVActionPerformed

    private void btnBuscarProudctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProudctoActionPerformed
        // TODO add your handling code here:
        // Obtener el código ingresado por el usuario
        // Obtener el texto ingresado por el usuario
        String textoBusqueda = txtCodigoABuscar.getText().trim();

        // Validar que el campo no esté vacío
        if (textoBusqueda.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa un código o nombre de producto.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Buscar el producto por código o nombre
            Productos producto = control.buscarProductoPorCodigo(textoBusqueda);

            // Cargar la tabla con el producto encontrado
            cargarTablaProductosPrincipal(producto);
        } catch (Exception e) {
            // Manejar errores
            JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarProudctoActionPerformed

    private void btnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductoActionPerformed
        // TODO add your handling code here:
        cargarTablaProductos();
    }//GEN-LAST:event_btnActualizarProductoActionPerformed

    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarProveedorActionPerformed

    private void btnGuardarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVentaActionPerformed
        try {
            int codigo = Integer.parseInt(txtCodigoVenta.getText());
            String nombre = txtNombreVenta.getText();
            int precio = Integer.parseInt(txtPrecioVenta.getText());
            int cantidad = Integer.parseInt(txtCantidadVenta.getText());
            int descuento = Integer.parseInt(txtDescuentoVenta.getText());
            int stock = Integer.parseInt(txtStockVenta.getText());

            if (cantidad > stock) {
                JOptionPane.showMessageDialog(null, "La cantidad debe ser menor o igual a " + stock);
                return;
            }

            // Validar si el código ya existe en la tabla
            DefaultTableModel modelo = (DefaultTableModel) tblVenta.getModel();
            for (int i = 0; i < modelo.getRowCount(); i++) {
                int codigoExistente = Integer.parseInt(modelo.getValueAt(i, 0).toString());
                if (codigo == codigoExistente) {
                    JOptionPane.showMessageDialog(this, "El producto con el código " + codigo + " ya existe en la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Evitar agregar el producto duplicado
                }
            }

            // Calcular el total
            int total = precio * cantidad;
            txtTotalVenta.setText(String.valueOf(total));

            // Agregar los datos a la tabla si no hay duplicados
            modelo.addRow(new Object[]{codigo, nombre, precio, cantidad, descuento, stock, total});

            // Limpiar los campos después de agregar
            limpiarCamposVenta();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Verifique los datos ingresados", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
        }

    }//GEN-LAST:event_btnGuardarVentaActionPerformed
    private void limpiarCamposVenta() {
        txtCodigoVenta.setText("");
        txtNombreVenta.setText("");
        txtStockVenta.setText("");
        txtPrecioVenta.setText("");
        txtCantidadVenta.setText("");
        txtTotalVenta.setText("");
        txtCodigoVenta.requestFocus(); // Colocar el foco en el campo de código
    }
    private void txtDescuentoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoVentaActionPerformed

    private void txtPrecioVentaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVentaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVentaProductoActionPerformed

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
        // TODO add your handling code here:
        // Verificar si hay una fila seleccionada
        int filaSeleccionada = tblVenta.getSelectedRow();

        if (filaSeleccionada != -1) { // Si hay una fila seleccionada
            DefaultTableModel modelo = (DefaultTableModel) tblVenta.getModel();

            // Eliminar la fila seleccionada del modelo
            modelo.removeRow(filaSeleccionada);

            // Mensaje de confirmación
            mostrarMensaje("Venta eliminada correctamente", "Info", "Operación Exitosa");
        } else {
            // Si no hay fila seleccionada, mostrar un mensaje de error
            mostrarMensaje("Debe seleccionar una fila para eliminar", "Error", "Sin Selección");
        }
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

    private void btnModificarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVentaActionPerformed
        // TODO add your handling code here:
        // Verificar si hay una fila seleccionada
        int filaSeleccionada = tblVenta.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para modificar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Obtener los valores actuales de la fila seleccionada
            DefaultTableModel modelo = (DefaultTableModel) tblVenta.getModel();

            int precio = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 2).toString()); // Precio de la columna 2
            int stock = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 5).toString()); // Stock de la columna 5

            // Solicitar al usuario la nueva cantidad
            String cantidadStr = txtCantidadVenta.getText();
            if (cantidadStr == null || cantidadStr.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe ingresar una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int nuevaCantidad = Integer.parseInt(cantidadStr);

            // Validar que la cantidad no sea mayor al stock
            if (nuevaCantidad > stock) {
                JOptionPane.showMessageDialog(this, "La cantidad no puede ser mayor al stock: " + stock, "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Calcular el nuevo total
            int nuevoTotal = precio * nuevaCantidad;

            // Actualizar la tabla con los nuevos valores
            modelo.setValueAt(nuevaCantidad, filaSeleccionada, 3); // Actualiza la cantidad (columna 3)
            modelo.setValueAt(nuevoTotal, filaSeleccionada, 6);    // Actualiza el total (columna 6)

            JOptionPane.showMessageDialog(this, "Cantidad modificada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarVentaActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        // TODO add your handling code here:
        try {
            // Obtener el modelo de la tabla
            DefaultTableModel modelo = (DefaultTableModel) tblVenta.getModel();

            // Variable para almacenar la suma total
            int sumaTotal = 0;

            // Recorrer todas las filas de la tabla
            for (int i = 0; i < modelo.getRowCount(); i++) {
                // Obtener el valor de la columna 'Total' (columna 6 en este caso)
                int totalProducto = Integer.parseInt(modelo.getValueAt(i, 6).toString());
                sumaTotal += totalProducto; // Sumar al total
            }

            // Mostrar la suma total en un cuadro de texto o mensaje
            txtTotalAPagarVenta.setText(String.valueOf(sumaTotal)); // Mostrar en un JTextField
            JOptionPane.showMessageDialog(this, "La suma total de la venta es: " + sumaTotal + " pesos", "Venta Generada", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al calcular la suma total de la venta.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void btnCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioActionPerformed
        // TODO add your handling code here:
        try {
            // Obtener el total de la venta desde el JTextField
            int totalVenta = Integer.parseInt(txtTotalAPagarVenta.getText()); // Asegúrate de que txtTotalVentaFinal tiene el total

            // Mostrar un cuadro de diálogo para pedir el monto de efectivo
            String efectivoStr = JOptionPane.showInputDialog(this, "Ingrese el monto de efectivo recibido:", "Pago", JOptionPane.PLAIN_MESSAGE);

            // Validar si el usuario ingresó un valor o canceló
            if (efectivoStr != null && !efectivoStr.trim().isEmpty()) {
                int efectivo = Integer.parseInt(efectivoStr); // Convertir a entero el monto ingresado

                // Verificar que el efectivo sea suficiente
                if (efectivo >= totalVenta) {
                    int cambio = efectivo - totalVenta; // Calcular el cambio

                    // Mostrar el cambio al usuario
                    JOptionPane.showMessageDialog(this, "Cambio: " + cambio + " pesos", "Cambio", JOptionPane.INFORMATION_MESSAGE);
                    txtCambioVenta.setText(String.valueOf(cambio));
                } else {
                    // Mostrar mensaje si el efectivo es insuficiente
                    JOptionPane.showMessageDialog(this, "El monto ingresado es insuficiente. Total a pagar: " + totalVenta, "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No ingresó ningún monto.", "Atención", JOptionPane.WARNING_MESSAGE);
            }

        } catch (NumberFormatException e) {
            // Manejar errores si el usuario ingresa algo que no es un número
            JOptionPane.showMessageDialog(this, "Por favor ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnCambioActionPerformed

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
        // TODO add your handling code here:
        try {
            // 1. Validar que haya productos en la tabla de ventas
            if (tblVenta.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No hay productos en la venta", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // 2. Guardar cada producto vendido en la base de datos o en la tabla de ventas
            DefaultTableModel modeloVenta = (DefaultTableModel) tblVenta.getModel();
            DefaultTableModel modeloProducto = (DefaultTableModel) tblProducto.getModel();

            for (int i = 0; i < modeloVenta.getRowCount(); i++) {
                int codigoVenta = (int) modeloVenta.getValueAt(i, 0);
                int cantidadVendida = (int) modeloVenta.getValueAt(i, 3);

                // Buscar el producto en la tabla de productos
                for (int j = 0; j < modeloProducto.getRowCount(); j++) {
                    int codigoProducto = Integer.parseInt(modeloProducto.getValueAt(j, 1).toString());

                    // Restar el stock si coincide el código del producto
                    if (codigoVenta == codigoProducto) {
                        int stockActual = Integer.parseInt(modeloProducto.getValueAt(j, 6).toString()); // Columna de stock
                        int nuevoStock = stockActual - cantidadVendida;

                        if (nuevoStock < 0) {
                            JOptionPane.showMessageDialog(this, "No hay suficiente stock para el producto con código: " + codigoVenta, "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // Actualizar el stock en la tabla
                        modeloProducto.setValueAt(nuevoStock, j, 6); // Actualizar columna de stock
                        break;
                    }
                }
            }

            // 3. Limpiar la tabla de ventas
            modeloVenta.setRowCount(0);

            // 4. Limpiar los campos de entrada
            limpiarCamposVenta();

            // 5. Mostrar mensaje de confirmación
            JOptionPane.showMessageDialog(this, "Venta registrada correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al registrar la venta: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnLimpiarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProductoActionPerformed
        // TODO add your handling code here:
        txtCodigoProducto.setText("");
        txtNombreProducto.setText("");
        txtColorProducto.setText("");
        txtStockProducto.setText("");
        txtDimensionProducto.setText("");
        txtPrecioCompraProducto.setText("");
        txtPrecioVentaProducto.setText("");
        txtMaterialProducto.setText("");
    }//GEN-LAST:event_btnLimpiarProductoActionPerformed

    private void btnReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReciboActionPerformed
//     try {
//        // Crear la instancia de PrinterMatrix
//        PrinterMatrix printer = new PrinterMatrix();
//
//        // Información de la venta
//        String numeroFactura = "000001"; // Cambiar dinámicamente según sea necesario
//        String fecha = txtFechaVenta.getText(); // Fecha actual
//        String hora = txtHoraVenta.getText();   // Hora actual
//        String nombreVendedor = txtNombreVendedor.getText(); // Nombre del vendedor
//        String nombreComprador = txtNombreClienteVenta.getText(); // Nombre del comprador
//        double totalVenta = Double.parseDouble(txtTotalAPagarVenta.getText()); // Total de la venta
//
//        // Configurar el tamaño del ticket
//        int filas = 15 + tblVenta.getRowCount(); // 15 líneas base + filas de productos
//        int columnas = 48; // Tamaño de columnas (48 para papel de 80mm)
//        printer.setOutSize(filas, columnas);
//
//        // Encabezado del ticket
//        printer.printCharAtCol(1, 1, columnas, "=");
//        printer.printTextWrap(1, 2, 10, columnas, "TIENDA DE AZULEJOS");
//        printer.printTextWrap(2, 3, 1, columnas, "Num. Factura: " + numeroFactura);
//        printer.printTextWrap(3, 4, 1, columnas, "Fecha: " + fecha);
//        printer.printTextWrap(4, 5, 1, columnas, "Hora: " + hora);
//        printer.printTextWrap(5, 6, 1, columnas, "Vendedor: " + nombreVendedor);
//        printer.printTextWrap(6, 7, 1, columnas, "Comprador: " + nombreComprador);
//        printer.printCharAtCol(7, 1, columnas, "=");
//
//        // Encabezado de la tabla
//        printer.printTextWrap(8, 9, 1, columnas, "Producto      PrecioU Cant Desc Subtotal");
//        printer.printCharAtCol(9, 1, columnas, "-");
//
//        // Construir las filas de la tabla con los datos de tblVenta
//        int filaInicio = 10; // La fila donde empieza el detalle de productos
//        for (int i = 0; i < tblVenta.getRowCount(); i++) {
//            String nombreProducto = tblVenta.getValueAt(i, 1).toString(); // Nombre del producto
//            String precioUnitario = tblVenta.getValueAt(i, 2).toString(); // Precio unitario
//            String cantidad = tblVenta.getValueAt(i, 3).toString(); // Cantidad
//            String descuento = tblVenta.getValueAt(i, 4).toString(); // Descuento
//            String subtotal = tblVenta.getValueAt(i, 5).toString(); // Subtotal
//
//            // Alinear las columnas para que se vean como una tabla
//            String fila = String.format("%-12s %-7s %-4s %-4s %-7s", 
//                nombreProducto.length() > 12 ? nombreProducto.substring(0, 12) : nombreProducto, 
//                precioUnitario, 
//                cantidad, 
//                descuento, 
//                subtotal
//            );
//            printer.printTextWrap(filaInicio + i, filaInicio + i + 1, 1, columnas, fila);
//        }
//
//        // Total y pie de página
//        int filaTotal = filaInicio + tblVenta.getRowCount();
//        printer.printCharAtCol(filaTotal, 1, columnas, "-");
//        printer.printTextWrap(filaTotal + 1, filaTotal + 2, 1, columnas, "TOTAL: $" + totalVenta);
//        printer.printTextWrap(filaTotal + 2, filaTotal + 3, 1, columnas, "Gracias por su compra");
//        printer.printCharAtCol(filaTotal + 3, 1, columnas, "=");
//
//        // Guardar el ticket en un archivo
//        printer.toFile("Impresion.txt");
//
//        // Configuración para imprimir
//        FileInputStream inputStream = new FileInputStream("Impresion.txt");
//        DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
//        Doc document = new SimpleDoc(inputStream, docFormat, null);
//
//        PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();
//        PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();
//
//        if (defaultPrintService != null) {
//            DocPrintJob printJob = defaultPrintService.createPrintJob();
//            printJob.print(document, attributeSet);
//        } else {
//            mostrarMensaje("No se encontró una impresora predeterminada", "Error", "Impresión");
//        }
//
//    } catch (FileNotFoundException ex) {
//        mostrarMensaje("Archivo no encontrado: " + ex.getMessage(), "Error", "Impresión");
//    } catch (Exception ex) {
//        mostrarMensaje("Ocurrió un error: " + ex.getMessage(), "Error", "Impresión");
//    }

    }//GEN-LAST:event_btnReciboActionPerformed

    private void btnBuscarClienteVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteVentaActionPerformed
        // Crear un JDialog para mostrar la tabla
        JDialog dialogoClientes = new JDialog(this, "Seleccionar Cliente", true);
        dialogoClientes.setSize(600, 400);
        dialogoClientes.setLocationRelativeTo(this);

        // Crear un JScrollPane con la tabla de clientes
        JScrollPane scrollPane = new JScrollPane(tblClientes);
        dialogoClientes.add(scrollPane);

        // Cargar los datos en la tabla desde la base de datos
        cargarTablaClientes(); // Este método ya lo tienes implementado

        // Evento de doble clic en la tabla
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) { // Detectar doble clic
                    // Llamar al método cargarDatosDesdeTabla para obtener la fila seleccionada
                    cargarDatosDesdeTabla();

                    // Cargar solo el nombre del cliente en el campo txtNombreClienteVenta
                    txtNombreClienteVenta.setText(txtNombreCliente.getText());

                    // Cerrar el diálogo
                    dialogoClientes.dispose();
                }
            }
        });

        // Mostrar el diálogo
        dialogoClientes.setVisible(true);

    }//GEN-LAST:event_btnBuscarClienteVentaActionPerformed

    private void btnBuscarProductoVenta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoVenta2ActionPerformed
          // Crear un diálogo modal
    JDialog dialogoProducto = new JDialog(this, "Seleccionar Producto", true);
    dialogoProducto.setSize(800, 600);
    dialogoProducto.setLocationRelativeTo(this);

    // Crear una nueva tabla para el diálogo
    JTable tablaVenta = new JTable(tblProducto.getModel()); // Usa el mismo modelo de datos

    // Crear un JScrollPane y añadir la tabla
    JScrollPane scrollPane = new JScrollPane(tablaVenta);
    dialogoProducto.add(scrollPane);

    // Agregar un MouseListener para detectar doble clic
    tablaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getClickCount() == 2) { // Detectar doble clic
                int filaSeleccionada = tablaVenta.getSelectedRow();

                if (filaSeleccionada != -1) { // Verificar que hay una fila seleccionada
                    String codigo = tablaVenta.getValueAt(filaSeleccionada, 1).toString();
                    String nombre = tablaVenta.getValueAt(filaSeleccionada, 2).toString();
                    String precio = tablaVenta.getValueAt(filaSeleccionada, 5).toString();
                    String stock = tablaVenta.getValueAt(filaSeleccionada, 6).toString();

                    // Cargar los datos en los campos correspondientes
                    txtCodigoVenta.setText(codigo);
                    txtNombreVenta.setText(nombre);
                    txtStockVenta.setText(stock);
                    txtPrecioVenta.setText(precio);

                    // Cerrar el diálogo
                    dialogoProducto.dispose();
                }
            }
        }
    });

    // Mostrar el diálogo
    dialogoProducto.setVisible(true);


    }//GEN-LAST:event_btnBuscarProductoVenta2ActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarClienteActionPerformed
    private void limpiarCamposVenta2() {
        txtCodigoVenta.setText("");
        txtNombreVenta.setText("");
        txtPrecioVenta.setText("");
        txtCantidadVenta.setText("");
        txtTotalVenta.setText("");
        txtDescuentoVenta.setText("");
        txtStockVenta.setText("");
    }

    private void cambiarVista(JPanel jPanel) {
        jPanel.setSize(jPanelPrincipal.getWidth(), jPanelPrincipal.getHeight());
        jPanelPrincipal.removeAll();
        jPanelPrincipal.add(jPanel);
        jPanelPrincipal.repaint();
    }

    private void ActivarVista(JPanel jPanel) {
        jPanelProductos.setEnabled(false);
        jPanelProductos.setVisible(false);

        jPanelClientes.setEnabled(false);
        jPanelClientes.setVisible(false);

        jPanelUsuarios.setEnabled(false);
        jPanelUsuarios.setVisible(false);

        jPanelVentas.setEnabled(false);
        jPanelVentas.setVisible(false);

        jPanelProveedor.setEnabled(false);
        jPanelProveedor.setVisible(false);

        jPanel.setVisible(true);
        jPanel.setEnabled(true);
    }

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnBorrarProducto;
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnAgregarProveedor;
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarClienteVenta;
    private javax.swing.JButton btnBuscarProductoV;
    private javax.swing.JButton btnBuscarProductoVenta2;
    private javax.swing.JButton btnBuscarProudcto;
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton btnCambio;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarProducto;
    private javax.swing.JButton btnEditarProveedor;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JButton btnGuardarVenta;
    private javax.swing.JButton btnImporte;
    private javax.swing.JButton btnLimpiarProducto;
    private javax.swing.JButton btnModificarVenta;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnRecibo;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbRolUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1Principal;
    private javax.swing.JMenu jMenu3Proveedor;
    private javax.swing.JMenu jMenu4Ventas;
    private javax.swing.JMenu jMenu5Configuracion;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenuItem jMenuItemIrAlLogin;
    private javax.swing.JMenuItem jMenuItemcategoria;
    private javax.swing.JMenu jMenuProductos;
    private javax.swing.JMenu jMenuUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel1Inicio;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelProductos;
    private javax.swing.JPanel jPanelProveedor;
    private javax.swing.JPanel jPanelUsuarios;
    private javax.swing.JPanel jPanelVentas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTable tblVenta;
    private javax.swing.JTextField txtCambioVenta;
    private javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtCodigoABuscar;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtCodigoVenta;
    private javax.swing.JTextField txtColorProducto;
    private javax.swing.JTextField txtContraseñaUsuario;
    private javax.swing.JTextField txtCorreoProveedor;
    private javax.swing.JTextField txtDescuentoVenta;
    private javax.swing.JTextField txtDimensionProducto;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtHoraVenta;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtMaterialProducto;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreClienteVenta;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JLabel txtNombreUser;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtNombreVendedor;
    private javax.swing.JTextField txtNombreVenta;
    private javax.swing.JTextField txtPedidoCliente;
    private javax.swing.JTextField txtPrecioCompraProducto;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtPrecioVentaProducto;
    private javax.swing.JTextField txtStockProducto;
    private javax.swing.JTextField txtStockVenta;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTelefonoProveedor;
    private javax.swing.JTextField txtTotalAPagarVenta;
    private javax.swing.JTextField txtTotalVenta;
    // End of variables declaration//GEN-END:variables

    ////////////////////////////CARGAR DATOS  DE BD EN LA TABLA////////////////////////////////////////
    private void cargarTablaUsuario() {
        //definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            //Que fila y columnas no sean editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //establecemos los nombres de las columnas
        String titulo[] = {"Id", "Usuario", "contraseña", "Rol"};
        modeloTabla.setColumnIdentifiers(titulo);

        //traer de la bd la lista de Usuario
        List<Usuario> listaUsuario = control.traerUsuarios();
        //preguntamos si la lista está vacia
        if (listaUsuario != null) {
            //Recorrer la lista
            for (Usuario usu : listaUsuario) {
                Object[] objeto = {usu.getId(), usu.getNombreUsuario(), usu.getContrasenia(), usu.getUnRol().getNombreRol()};

                modeloTabla.addRow(objeto);

            }
        }

        tblUsuarios.setModel(modeloTabla);
    }

    private void cargarTablaClientes() {
//definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla1 = new DefaultTableModel() {

            //Que fila y columnas no sean editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //establecemos los nombres de las columnas
        String titulo[] = {"Id", "Nombre", "Direccion", "Numero", "Pedido"};
        modeloTabla1.setColumnIdentifiers(titulo);

        //traer de la bd la lista de Usuario
        List<Clientes> listaClientes = control.traerClientes();
        //preguntamos si la lista está vacia
        if (listaClientes != null) {
            //Recorrer la lista
            for (Clientes cli : listaClientes) {
                Object[] objeto1 = {cli.getId(), cli.getNombre(), cli.getDireccion(), cli.getNumero(), cli.getPedido()};

                modeloTabla1.addRow(objeto1);
            }
        }

        tblClientes.setModel(modeloTabla1);

    }

    private void cargarTablaProveedor() {
        DefaultTableModel modeloTabla2 = new DefaultTableModel() {

            //Que fila y columnas no sean editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //establecemos los nombres de las columnas
        String titulo[] = {"Id", "Nombre", "Direccion", "Correo", "Telefono"};
        modeloTabla2.setColumnIdentifiers(titulo);

        //traer de la bd la lista de Usuario
        List<Proveedor> listaProveedor = control.traerProveedor();
        //preguntamos si la lista está vacia
        if (listaProveedor != null) {
            //Recorrer la lista
            for (Proveedor prov : listaProveedor) {
                Object[] objeto1 = {prov.getId_proveedor(), prov.getNombre(), prov.getDireccion(), prov.getCorreo(), prov.getTelefono()};

                modeloTabla2.addRow(objeto1);
            }
        }
        tblProveedor.setModel(modeloTabla2);
    }

    //CARGAR TABLA PRODUCTOS
    private void cargarTablaProductos() {
        // Crear el modelo de la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hacer las celdas no editables
            }
        };

        // Definir los nombres de las columnas
        String[] titulos = {"Id", "Código", "Nombre", "Color", "Dimensión", "Precio Venta", "Stock", "Precio Compra", "Material", "Categoría"};
        modeloTabla.setColumnIdentifiers(titulos);

        // Obtener la lista de productos desde el controlador
        List<Productos> listaProductos = control.TraerProducto();

        // Verificar que la lista no sea nula ni vacía
        if (listaProductos != null && !listaProductos.isEmpty()) {
            for (Productos prod : listaProductos) {
                // Agregar cada producto como una fila
                Object[] fila = {
                    prod.getIdProducto(),
                    prod.getCodigo(),
                    prod.getNombre(),
                    prod.getColor(),
                    prod.getDimension(),
                    prod.getPrecioVenta(),
                    prod.getStockDisponible(),
                    prod.getPrecioCompra(),
                    prod.getMaterial(),
                    prod.getUnCategoria() != null ? prod.getUnCategoria().getNombre() : "Sin categoría"
                };
                modeloTabla.addRow(fila);
            }
        } else {
            // Mensaje opcional: No hay productos
            mostrarMensaje("No hay productos para mostrar", "Info", "Sin datos");
        }

        // Asignar el modelo a la tabla
        tblProducto.setModel(modeloTabla);
    }

    private void cargarTablaProductosPrincipal(Productos productoBuscado) {
        // Crear el modelo de la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hacer las celdas no editables
            }
        };

        // Definir los nombres de las columnas
        String[] titulos = {"Id", "Código", "Nombre", "Color", "Dimensión", "Precio Venta", "Stock", "Precio Compra", "Material", "Categoría"};
        modeloTabla.setColumnIdentifiers(titulos);

        // Si el producto buscado no es nulo, cargar solo ese producto
        if (productoBuscado != null) {
            Object[] fila = {
                productoBuscado.getIdProducto(),
                productoBuscado.getCodigo(),
                productoBuscado.getNombre(),
                productoBuscado.getColor(),
                productoBuscado.getDimension(),
                productoBuscado.getPrecioVenta(),
                productoBuscado.getStockDisponible(),
                productoBuscado.getPrecioCompra(),
                productoBuscado.getMaterial(),
                productoBuscado.getUnCategoria() != null ? productoBuscado.getUnCategoria().getNombre() : "Sin categoría"
            };
            modeloTabla.addRow(fila);
        } else {
            // Mensaje opcional: No se encontró el producto
            mostrarMensaje("Producto no encontrado", "Error", "Sin resultados");
        }

        // Asignar el modelo a la tabla
        tblProducto.setModel(modeloTabla);
    }

    ////////////////////////////////////CARGAR DATOS DESDE LA TABLA///////////////////////////////////
    private void cargarDatosDesdeTabla() {
        // Verificamos que haya una fila seleccionada
        int filaSeleccionada = tblClientes.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtenemos los datos de la fila seleccionada
            int id_Cliente = Integer.parseInt(String.valueOf(tblClientes.getValueAt(filaSeleccionada, 0)));
            cli = control.traerCliente(id_Cliente); // Buscamos el cliente por su ID

            // Cargamos los datos en los campos de texto
            txtNombreCliente.setText(cli.getNombre());
            txtDireccionCliente.setText(cli.getDireccion());
            txtTelefonoCliente.setText(cli.getNumero());
            txtPedidoCliente.setText(cli.getPedido());
        }
    }

    private void cargarDatosDesdeTablaUsuario() {
        int filaSeleccionada = tblUsuarios.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Obtener los valores de la fila seleccionada
            int idUsuario = (int) tblUsuarios.getValueAt(filaSeleccionada, 0);
            String nombreUsuario = (String) tblUsuarios.getValueAt(filaSeleccionada, 1);
            String contra = (String) tblUsuarios.getValueAt(filaSeleccionada, 2);
            String rolUsuario = (String) tblUsuarios.getValueAt(filaSeleccionada, 3);

            // Cargar los valores en los campos de texto y combo
            txtNombreUsuario.setText(nombreUsuario);
            txtContraseñaUsuario.setText(contra);
            cmbRolUsuario.setSelectedItem(rolUsuario);

            // Puedes almacenar el ID si necesitas usarlo para actualizar
            usr = control.traerUsuario(idUsuario); // Obtener el objeto completo del usuario desde la BD
        }
    }

    private void cargarDatosDesdeTablaProveedor() {
        int filaSeleccionada = tblProveedor.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Obtener los valores de la fila seleccionada
            int idProveedor = (int) tblProveedor.getValueAt(filaSeleccionada, 0);
            String nombreProveedor = (String) tblProveedor.getValueAt(filaSeleccionada, 1);
            String direccionProveedor = (String) tblProveedor.getValueAt(filaSeleccionada, 2);
            String CorreoProveedor = (String) tblProveedor.getValueAt(filaSeleccionada, 3);
            String telefonoProveedor = (String) tblProveedor.getValueAt(filaSeleccionada, 4);

            // Cargar los valores en los campos de texto y combo
            txtNombreProveedor.setText(nombreProveedor);
            txtDireccionProveedor.setText(direccionProveedor);
            txtCorreoProveedor.setText(CorreoProveedor);
            txtTelefonoProveedor.setText(telefonoProveedor);

            // Puedes almacenar el ID si necesitas usarlo para actualizar
            prov = control.traerProveedor(idProveedor); // Obtener el objeto completo del usuario desde la BD
        }

    }

    private void cargarDatosDesdeTablaProducto() {
        // Obtener la fila seleccionada
        int filaSeleccionada = tblProducto.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Obtener los valores de la fila seleccionada
            int idProducto = (int) tblProducto.getValueAt(filaSeleccionada, 0);
            String codigo = (String) tblProducto.getValueAt(filaSeleccionada, 1);
            String nombre = (String) tblProducto.getValueAt(filaSeleccionada, 2);
            String color = (String) tblProducto.getValueAt(filaSeleccionada, 3);
            String dimension = (String) tblProducto.getValueAt(filaSeleccionada, 4);
            int precioVenta = (int) tblProducto.getValueAt(filaSeleccionada, 5);
            int stock = (int) tblProducto.getValueAt(filaSeleccionada, 6);
            int precioCompra = (int) tblProducto.getValueAt(filaSeleccionada, 7);
            String material = (String) tblProducto.getValueAt(filaSeleccionada, 8);
            String categoria = (String) tblProducto.getValueAt(filaSeleccionada, 9);

            // Cargar los valores en los campos de texto
            txtCodigoProducto.setText(codigo);
            txtNombreProducto.setText(nombre);
            txtColorProducto.setText(color);
            txtDimensionProducto.setText(dimension);
            txtPrecioVentaProducto.setText(String.valueOf(precioVenta));
            txtStockProducto.setText(String.valueOf(stock));
            txtPrecioCompraProducto.setText(String.valueOf(precioCompra));
            txtMaterialProducto.setText(material);

            // Si tienes un campo para mostrar la categoría, podrías establecerlo aquí
            cmbCategoria.setSelectedItem(categoria);
            // Almacenar el objeto completo si es necesario
            prod = control.traerProducto(idProducto); // Objeto producto desde la BD
        } else {
            mostrarMensaje("No se seleccionó ninguna fila", "Error", "Selección vacía");
        }
    }

    private void cargarDatosVentaDesdeTabla() {
        // Verificar si hay una fila seleccionada
        int filaSeleccionada = tblVenta.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtener los datos de la fila seleccionada
            String codigo = String.valueOf(tblVenta.getValueAt(filaSeleccionada, 0)); // Columna 0: Código
            String nombre = String.valueOf(tblVenta.getValueAt(filaSeleccionada, 1)); // Columna 1: Nombre
            String precio = String.valueOf(tblVenta.getValueAt(filaSeleccionada, 2)); // Columna 2: Precio
            String cantidad = String.valueOf(tblVenta.getValueAt(filaSeleccionada, 3)); // Columna 3: Cantidad
            String decuento = String.valueOf(tblVenta.getValueAt(filaSeleccionada, 4));//Columna 4: descuento
            String Stock = String.valueOf(tblVenta.getValueAt(filaSeleccionada, 5));//Columna 5: Stock
            String total = String.valueOf(tblVenta.getValueAt(filaSeleccionada, 6)); // Columna 4: Total

            // Cargar los datos en los campos de texto
            txtCodigoVenta.setText(codigo);
            txtNombreVenta.setText(nombre);
            txtPrecioVenta.setText(precio);
            txtCantidadVenta.setText(cantidad);
            txtDescuentoVenta.setText(decuento);
            txtStockVenta.setText(Stock);
            txtTotalVenta.setText(total);

        } else {
            // Mostrar un mensaje si no hay fila seleccionada
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    ///////////////////////////////////////////////////METODOS ACTUALIZAR DATOS///////////////////////////////////
    void actualizarCliente() {
        int fila = tblClientes.getSelectedRow(); // Obtenemos la fila seleccionada
        if (fila != -1) {
            // Obtenemos los valores de los campos de texto
            String nombre = txtNombreCliente.getText();
            String direccion = txtDireccionCliente.getText();
            String telefono = txtTelefonoCliente.getText();
            String pedido = txtPedidoCliente.getText();

            // Actualizamos el cliente
            control.editarCliente(cli, nombre, direccion, telefono, pedido);

            mostrarMensaje("Cliente editado correctamente", "Info", "Actualización exitosa");
        } else {
            mostrarMensaje("No seleccionaste ninguna fila para actualizar", "Error", "Error de actualización");
        }
    }

    void actualizarUsuario() {
        int fila = tblUsuarios.getSelectedRow(); // Obtenemos la fila seleccionada
        if (fila != -1) {
            // Obtenemos los valores de los campos de texto
            String Usuario = txtNombreUsuario.getText();
            String contrasenia = txtContraseñaUsuario.getText();
            String rol = (String) cmbRolUsuario.getSelectedItem();

            // Actualizamos el cliente
            control.editarUsuario(usr, Usuario, contrasenia, rol);

            mostrarMensaje("Usuario editado correctamente", "Info", "Actualización exitosa");
        } else {
            mostrarMensaje("No seleccionaste ninguna fila para actualizar", "Error", "Error de actualización");
        }
    }

    void actualizarProveedor() {

        int fila = tblProveedor.getSelectedRow(); // Obtenemos la fila seleccionada
        if (fila != -1) {
            // Obtenemos los valores de los campos de texto
            String nombre = txtNombreProveedor.getText();
            String direccion = txtDireccionProveedor.getText();
            String correo = txtCorreoProveedor.getText();
            String telefono = txtTelefonoProveedor.getText();

            // Actualizamos el cliente
            control.editarProveedor(prov, nombre, direccion, correo, telefono);

            mostrarMensaje("Proveedor editado correctamente", "Info", "Actualización exitosa");
        } else {
            mostrarMensaje("No seleccionaste ninguna fila para actualizar", "Error", "Error de actualización");
        }
    }

    private boolean validarCampos(JTextField[] campos) {
        for (JTextField campo : campos) {
            if (campo.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }

}
