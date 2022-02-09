// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.ADLSGen1FolderDataSetArgs;
import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:datashare:ADLSGen1FolderDataSet")
public class ADLSGen1FolderDataSet extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accountName", type=String.class, parameters={})
    private Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }
    @OutputExport(name="dataSetId", type=String.class, parameters={})
    private Output<String> dataSetId;

    public Output<String> getDataSetId() {
        return this.dataSetId;
    }
    @OutputExport(name="folderPath", type=String.class, parameters={})
    private Output<String> folderPath;

    public Output<String> getFolderPath() {
        return this.folderPath;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="resourceGroup", type=String.class, parameters={})
    private Output<String> resourceGroup;

    public Output<String> getResourceGroup() {
        return this.resourceGroup;
    }
    @OutputExport(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    public Output<String> getSubscriptionId() {
        return this.subscriptionId;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ADLSGen1FolderDataSet(String name, ADLSGen1FolderDataSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ADLSGen1FolderDataSet", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ADLSGen1FolderDataSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ADLSGen1FolderDataSet", name, null, makeResourceOptions(options, id));
    }

    private static ADLSGen1FolderDataSetArgs makeArgs(ADLSGen1FolderDataSetArgs args) {
        var builder = args == null ? ADLSGen1FolderDataSetArgs.builder() : ADLSGen1FolderDataSetArgs.builder(args);
        return builder
            .setKind("AdlsGen1Folder")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:datashare/v20181101preview:ADLSGen1FolderDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20191101:ADLSGen1FolderDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20200901:ADLSGen1FolderDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20201001preview:ADLSGen1FolderDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20210801:ADLSGen1FolderDataSet").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ADLSGen1FolderDataSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ADLSGen1FolderDataSet(name, id, options);
    }
}
