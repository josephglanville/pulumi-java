// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.m365securityandcompliance.PrivateLinkServicesForM365ComplianceCenterArgs;
import io.pulumi.azurenative.m365securityandcompliance.outputs.ServicesPropertiesResponse;
import io.pulumi.azurenative.m365securityandcompliance.outputs.ServicesResourceResponseIdentity;
import io.pulumi.azurenative.m365securityandcompliance.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:m365securityandcompliance:privateLinkServicesForM365ComplianceCenter")
public class PrivateLinkServicesForM365ComplianceCenter extends io.pulumi.resources.CustomResource {
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="identity", type=ServicesResourceResponseIdentity.class, parameters={})
    private Output</* @Nullable */ ServicesResourceResponseIdentity> identity;

    public Output</* @Nullable */ ServicesResourceResponseIdentity> getIdentity() {
        return this.identity;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
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
    @OutputExport(name="properties", type=ServicesPropertiesResponse.class, parameters={})
    private Output<ServicesPropertiesResponse> properties;

    public Output<ServicesPropertiesResponse> getProperties() {
        return this.properties;
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

    public PrivateLinkServicesForM365ComplianceCenter(String name, PrivateLinkServicesForM365ComplianceCenterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:m365securityandcompliance:privateLinkServicesForM365ComplianceCenter", name, args == null ? PrivateLinkServicesForM365ComplianceCenterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateLinkServicesForM365ComplianceCenter(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:m365securityandcompliance:privateLinkServicesForM365ComplianceCenter", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:m365securityandcompliance/v20210325preview:privateLinkServicesForM365ComplianceCenter").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PrivateLinkServicesForM365ComplianceCenter get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateLinkServicesForM365ComplianceCenter(name, id, options);
    }
}
