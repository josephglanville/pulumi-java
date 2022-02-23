// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.backup.BackupPlanArgs;
import io.pulumi.awsnative.backup.outputs.BackupPlanResourceType;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Backup::BackupPlan
 * 
 */
@ResourceType(type="aws-native:backup:BackupPlan")
public class BackupPlan extends io.pulumi.resources.CustomResource {
    @OutputExport(name="backupPlan", type=BackupPlanResourceType.class, parameters={})
    private Output<BackupPlanResourceType> backupPlan;

    public Output<BackupPlanResourceType> getBackupPlan() {
        return this.backupPlan;
    }
    @OutputExport(name="backupPlanArn", type=String.class, parameters={})
    private Output<String> backupPlanArn;

    public Output<String> getBackupPlanArn() {
        return this.backupPlanArn;
    }
    @OutputExport(name="backupPlanId", type=String.class, parameters={})
    private Output<String> backupPlanId;

    public Output<String> getBackupPlanId() {
        return this.backupPlanId;
    }
    @OutputExport(name="backupPlanTags", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> backupPlanTags;

    public Output</* @Nullable */ Object> getBackupPlanTags() {
        return this.backupPlanTags;
    }
    @OutputExport(name="versionId", type=String.class, parameters={})
    private Output<String> versionId;

    public Output<String> getVersionId() {
        return this.versionId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackupPlan(String name) {
        this(name, BackupPlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackupPlan(String name, BackupPlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackupPlan(String name, BackupPlanArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:backup:BackupPlan", name, args == null ? BackupPlanArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BackupPlan(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:backup:BackupPlan", name, null, makeResourceOptions(options, id));
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
    public static BackupPlan get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BackupPlan(name, id, options);
    }
}
