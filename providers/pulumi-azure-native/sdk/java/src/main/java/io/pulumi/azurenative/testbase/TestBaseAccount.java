// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.testbase.TestBaseAccountArgs;
import io.pulumi.azurenative.testbase.outputs.SystemDataResponse;
import io.pulumi.azurenative.testbase.outputs.TestBaseAccountSKUResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:testbase:TestBaseAccount")
public class TestBaseAccount extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accessLevel", type=String.class, parameters={})
    private Output<String> accessLevel;

    public Output<String> getAccessLevel() {
        return this.accessLevel;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="sku", type=TestBaseAccountSKUResponse.class, parameters={})
    private Output<TestBaseAccountSKUResponse> sku;

    public Output<TestBaseAccountSKUResponse> getSku() {
        return this.sku;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public TestBaseAccount(String name, TestBaseAccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:testbase:TestBaseAccount", name, args == null ? TestBaseAccountArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TestBaseAccount(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:testbase:TestBaseAccount", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:testbase/v20201216preview:TestBaseAccount").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static TestBaseAccount get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TestBaseAccount(name, id, options);
    }
}