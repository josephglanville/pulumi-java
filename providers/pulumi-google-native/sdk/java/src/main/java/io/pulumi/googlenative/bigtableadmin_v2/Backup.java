// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigtableadmin_v2.BackupArgs;
import io.pulumi.googlenative.bigtableadmin_v2.outputs.EncryptionInfoResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Starts creating a new Cloud Bigtable Backup. The returned backup long-running operation can be used to track creation of the backup. The metadata field type is CreateBackupMetadata. The response field type is Backup, if successful. Cancelling the returned operation will stop the creation and delete the backup.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:bigtableadmin/v2:Backup")
public class Backup extends io.pulumi.resources.CustomResource {
    /**
     * The encryption information for the backup.
     * 
     */
    @OutputExport(name="encryptionInfo", type=EncryptionInfoResponse.class, parameters={})
    private Output<EncryptionInfoResponse> encryptionInfo;

    /**
     * @return The encryption information for the backup.
     * 
     */
    public Output<EncryptionInfoResponse> getEncryptionInfo() {
        return this.encryptionInfo;
    }
    /**
     * `end_time` is the time that the backup was finished. The row data in the backup will be no newer than this timestamp.
     * 
     */
    @OutputExport(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return `end_time` is the time that the backup was finished. The row data in the backup will be no newer than this timestamp.
     * 
     */
    public Output<String> getEndTime() {
        return this.endTime;
    }
    /**
     * The expiration time of the backup, with microseconds granularity that must be at least 6 hours and at most 30 days from the time the request is received. Once the `expire_time` has passed, Cloud Bigtable will delete the backup and free the resources used by the backup.
     * 
     */
    @OutputExport(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return The expiration time of the backup, with microseconds granularity that must be at least 6 hours and at most 30 days from the time the request is received. Once the `expire_time` has passed, Cloud Bigtable will delete the backup and free the resources used by the backup.
     * 
     */
    public Output<String> getExpireTime() {
        return this.expireTime;
    }
    /**
     * A globally unique identifier for the backup which cannot be changed. Values are of the form `projects/{project}/instances/{instance}/clusters/{cluster}/ backups/_a-zA-Z0-9*` The final segment of the name must be between 1 and 50 characters in length. The backup is stored in the cluster identified by the prefix of the backup name of the form `projects/{project}/instances/{instance}/clusters/{cluster}`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A globally unique identifier for the backup which cannot be changed. Values are of the form `projects/{project}/instances/{instance}/clusters/{cluster}/ backups/_a-zA-Z0-9*` The final segment of the name must be between 1 and 50 characters in length. The backup is stored in the cluster identified by the prefix of the backup name of the form `projects/{project}/instances/{instance}/clusters/{cluster}`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Size of the backup in bytes.
     * 
     */
    @OutputExport(name="sizeBytes", type=String.class, parameters={})
    private Output<String> sizeBytes;

    /**
     * @return Size of the backup in bytes.
     * 
     */
    public Output<String> getSizeBytes() {
        return this.sizeBytes;
    }
    /**
     * Immutable. Name of the table from which this backup was created. This needs to be in the same instance as the backup. Values are of the form `projects/{project}/instances/{instance}/tables/{source_table}`.
     * 
     */
    @OutputExport(name="sourceTable", type=String.class, parameters={})
    private Output<String> sourceTable;

    /**
     * @return Immutable. Name of the table from which this backup was created. This needs to be in the same instance as the backup. Values are of the form `projects/{project}/instances/{instance}/tables/{source_table}`.
     * 
     */
    public Output<String> getSourceTable() {
        return this.sourceTable;
    }
    /**
     * `start_time` is the time that the backup was started (i.e. approximately the time the CreateBackup request is received). The row data in this backup will be no older than this timestamp.
     * 
     */
    @OutputExport(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return `start_time` is the time that the backup was started (i.e. approximately the time the CreateBackup request is received). The row data in this backup will be no older than this timestamp.
     * 
     */
    public Output<String> getStartTime() {
        return this.startTime;
    }
    /**
     * The current state of the backup.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the backup.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Backup(String name) {
        this(name, BackupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Backup(String name, BackupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Backup(String name, BackupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigtableadmin/v2:Backup", name, args == null ? BackupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Backup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigtableadmin/v2:Backup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Backup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Backup(name, id, options);
    }
}
