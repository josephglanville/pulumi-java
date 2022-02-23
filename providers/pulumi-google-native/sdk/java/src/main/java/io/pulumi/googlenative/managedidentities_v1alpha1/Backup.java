// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.managedidentities_v1alpha1.BackupArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a Backup for a domain.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:managedidentities/v1alpha1:Backup")
public class Backup extends io.pulumi.resources.CustomResource {
    /**
     * The time the backups was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the backups was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. Resource labels to represent user provided metadata.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Resource labels to represent user provided metadata.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The unique name of the Backup in the form of projects/{project_id}/locations/global/domains/{domain_name}/backups/{name}
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique name of the Backup in the form of projects/{project_id}/locations/global/domains/{domain_name}/backups/{name}
     * 
     */
    public Output<String> getName() {
        return this.name;
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
     * Additional information about the current status of this backup, if available.
     * 
     */
    @OutputExport(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    /**
     * @return Additional information about the current status of this backup, if available.
     * 
     */
    public Output<String> getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * Indicates whether it’s an on-demand backup or scheduled.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Indicates whether it’s an on-demand backup or scheduled.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Last update time.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Last update time.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
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
        super("google-native:managedidentities/v1alpha1:Backup", name, args == null ? BackupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Backup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:managedidentities/v1alpha1:Backup", name, null, makeResourceOptions(options, id));
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
