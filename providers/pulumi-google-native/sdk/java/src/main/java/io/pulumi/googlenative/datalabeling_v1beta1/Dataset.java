// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datalabeling_v1beta1.DatasetArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1InputConfigResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates dataset. If success return a Dataset resource.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:datalabeling/v1beta1:Dataset")
public class Dataset extends io.pulumi.resources.CustomResource {
    /**
     * The names of any related resources that are blocking changes to the dataset.
     * 
     */
    @Export(name="blockingResources", type=List.class, parameters={String.class})
    private Output<List<String>> blockingResources;

    /**
     * @return The names of any related resources that are blocking changes to the dataset.
     * 
     */
    public Output<List<String>> getBlockingResources() {
        return this.blockingResources;
    }
    /**
     * Time the dataset is created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time the dataset is created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The number of data items in the dataset.
     * 
     */
    @Export(name="dataItemCount", type=String.class, parameters={})
    private Output<String> dataItemCount;

    /**
     * @return The number of data items in the dataset.
     * 
     */
    public Output<String> getDataItemCount() {
        return this.dataItemCount;
    }
    /**
     * Optional. User-provided description of the annotation specification set. The description can be up to 10000 characters long.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. User-provided description of the annotation specification set. The description can be up to 10000 characters long.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The display name of the dataset. Maximum of 64 characters.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name of the dataset. Maximum of 64 characters.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * This is populated with the original input configs where ImportData is called. It is available only after the clients import data to this dataset.
     * 
     */
    @Export(name="inputConfigs", type=List.class, parameters={GoogleCloudDatalabelingV1beta1InputConfigResponse.class})
    private Output<List<GoogleCloudDatalabelingV1beta1InputConfigResponse>> inputConfigs;

    /**
     * @return This is populated with the original input configs where ImportData is called. It is available only after the clients import data to this dataset.
     * 
     */
    public Output<List<GoogleCloudDatalabelingV1beta1InputConfigResponse>> getInputConfigs() {
        return this.inputConfigs;
    }
    /**
     * Last time that the Dataset is migrated to AI Platform V2. If any of the AnnotatedDataset is migrated, the last_migration_time in Dataset is also updated.
     * 
     */
    @Export(name="lastMigrateTime", type=String.class, parameters={})
    private Output<String> lastMigrateTime;

    /**
     * @return Last time that the Dataset is migrated to AI Platform V2. If any of the AnnotatedDataset is migrated, the last_migration_time in Dataset is also updated.
     * 
     */
    public Output<String> getLastMigrateTime() {
        return this.lastMigrateTime;
    }
    /**
     * Dataset resource name, format is: projects/{project_id}/datasets/{dataset_id}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Dataset resource name, format is: projects/{project_id}/datasets/{dataset_id}
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Dataset(String name) {
        this(name, DatasetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Dataset(String name, DatasetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Dataset(String name, DatasetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datalabeling/v1beta1:Dataset", name, args == null ? DatasetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Dataset(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datalabeling/v1beta1:Dataset", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Dataset get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Dataset(name, id, options);
    }
}
