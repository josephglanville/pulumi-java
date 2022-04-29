// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Database.AutonomousDatabaseBackupArgs;
import com.pulumi.oci.Database.inputs.AutonomousDatabaseBackupState;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource provides the Autonomous Database Backup resource in Oracle Cloud Infrastructure Database service.
 * 
 * Creates a new Autonomous Database backup for the specified database based on the provided request parameters.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AutonomousDatabaseBackups can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Database/autonomousDatabaseBackup:AutonomousDatabaseBackup test_autonomous_database_backup &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Database/autonomousDatabaseBackup:AutonomousDatabaseBackup")
public class AutonomousDatabaseBackup extends com.pulumi.resources.CustomResource {
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Autonomous Database backup.
     * 
     */
    @Export(name="autonomousDatabaseId", type=String.class, parameters={})
    private Output<String> autonomousDatabaseId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Autonomous Database backup.
     * 
     */
    public Output<String> autonomousDatabaseId() {
        return this.autonomousDatabaseId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * The size of the database in terabytes at the time the backup was taken.
     * 
     */
    @Export(name="databaseSizeInTbs", type=Double.class, parameters={})
    private Output<Double> databaseSizeInTbs;

    /**
     * @return The size of the database in terabytes at the time the backup was taken.
     * 
     */
    public Output<Double> databaseSizeInTbs() {
        return this.databaseSizeInTbs;
    }
    /**
     * The user-friendly name for the backup. The name does not have to be unique.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The user-friendly name for the backup. The name does not have to be unique.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Indicates whether the backup is user-initiated or automatic.
     * 
     */
    @Export(name="isAutomatic", type=Boolean.class, parameters={})
    private Output<Boolean> isAutomatic;

    /**
     * @return Indicates whether the backup is user-initiated or automatic.
     * 
     */
    public Output<Boolean> isAutomatic() {
        return this.isAutomatic;
    }
    /**
     * Indicates whether the backup can be used to restore the associated Autonomous Database.
     * 
     */
    @Export(name="isRestorable", type=Boolean.class, parameters={})
    private Output<Boolean> isRestorable;

    /**
     * @return Indicates whether the backup can be used to restore the associated Autonomous Database.
     * 
     */
    public Output<Boolean> isRestorable() {
        return this.isRestorable;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key store.
     * 
     */
    @Export(name="keyStoreId", type=String.class, parameters={})
    private Output<String> keyStoreId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key store.
     * 
     */
    public Output<String> keyStoreId() {
        return this.keyStoreId;
    }
    /**
     * The wallet name for Oracle Key Vault.
     * 
     */
    @Export(name="keyStoreWalletName", type=String.class, parameters={})
    private Output<String> keyStoreWalletName;

    /**
     * @return The wallet name for Oracle Key Vault.
     * 
     */
    public Output<String> keyStoreWalletName() {
        return this.keyStoreWalletName;
    }
    /**
     * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation.
     * 
     */
    @Export(name="kmsKeyVersionId", type=String.class, parameters={})
    private Output<String> kmsKeyVersionId;

    /**
     * @return The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation.
     * 
     */
    public Output<String> kmsKeyVersionId() {
        return this.kmsKeyVersionId;
    }
    /**
     * Additional information about the current lifecycle state.
     * 
     */
    @Export(name="lifecycleDetails", type=String.class, parameters={})
    private Output<String> lifecycleDetails;

    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    public Output<String> lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * The current state of the backup.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the backup.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The date and time the backup completed.
     * 
     */
    @Export(name="timeEnded", type=String.class, parameters={})
    private Output<String> timeEnded;

    /**
     * @return The date and time the backup completed.
     * 
     */
    public Output<String> timeEnded() {
        return this.timeEnded;
    }
    /**
     * The date and time the backup started.
     * 
     */
    @Export(name="timeStarted", type=String.class, parameters={})
    private Output<String> timeStarted;

    /**
     * @return The date and time the backup started.
     * 
     */
    public Output<String> timeStarted() {
        return this.timeStarted;
    }
    /**
     * The type of backup.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of backup.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * 
     */
    @Export(name="vaultId", type=String.class, parameters={})
    private Output<String> vaultId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * 
     */
    public Output<String> vaultId() {
        return this.vaultId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutonomousDatabaseBackup(String name) {
        this(name, AutonomousDatabaseBackupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutonomousDatabaseBackup(String name, AutonomousDatabaseBackupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutonomousDatabaseBackup(String name, AutonomousDatabaseBackupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Database/autonomousDatabaseBackup:AutonomousDatabaseBackup", name, args == null ? AutonomousDatabaseBackupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AutonomousDatabaseBackup(String name, Output<String> id, @Nullable AutonomousDatabaseBackupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Database/autonomousDatabaseBackup:AutonomousDatabaseBackup", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AutonomousDatabaseBackup get(String name, Output<String> id, @Nullable AutonomousDatabaseBackupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutonomousDatabaseBackup(name, id, state, options);
    }
}
