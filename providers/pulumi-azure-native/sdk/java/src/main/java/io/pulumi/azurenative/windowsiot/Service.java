// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.windowsiot;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.windowsiot.ServiceArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:windowsiot:Service")
public class Service extends io.pulumi.resources.CustomResource {
    @OutputExport(name="adminDomainName", type=String.class, parameters={})
    private Output</* @Nullable */ String> adminDomainName;

    public Output</* @Nullable */ String> getAdminDomainName() {
        return this.adminDomainName;
    }
    @OutputExport(name="billingDomainName", type=String.class, parameters={})
    private Output</* @Nullable */ String> billingDomainName;

    public Output</* @Nullable */ String> getBillingDomainName() {
        return this.billingDomainName;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="notes", type=String.class, parameters={})
    private Output</* @Nullable */ String> notes;

    public Output</* @Nullable */ String> getNotes() {
        return this.notes;
    }
    @OutputExport(name="quantity", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> quantity;

    public Output</* @Nullable */ Double> getQuantity() {
        return this.quantity;
    }
    @OutputExport(name="startDate", type=String.class, parameters={})
    private Output<String> startDate;

    public Output<String> getStartDate() {
        return this.startDate;
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

    public Service(String name, ServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:windowsiot:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Service(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:windowsiot:Service", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:windowsiot/v20180216preview:Service").build()),
                Input.of(Alias.builder().setType("azure-native:windowsiot/v20190601:Service").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Service get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, options);
    }
}