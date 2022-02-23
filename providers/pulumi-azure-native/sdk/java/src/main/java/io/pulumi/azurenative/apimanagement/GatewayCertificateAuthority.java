// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.GatewayCertificateAuthorityArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Gateway certificate authority details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:GatewayCertificateAuthority cert1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/gateways/gw1/certificateAuthorities/cert1 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:GatewayCertificateAuthority")
public class GatewayCertificateAuthority extends io.pulumi.resources.CustomResource {
    /**
     * Determines whether certificate authority is trusted.
     * 
     */
    @OutputExport(name="isTrusted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isTrusted;

    /**
     * @return Determines whether certificate authority is trusted.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsTrusted() {
        return this.isTrusted;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GatewayCertificateAuthority(String name) {
        this(name, GatewayCertificateAuthorityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GatewayCertificateAuthority(String name, GatewayCertificateAuthorityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GatewayCertificateAuthority(String name, GatewayCertificateAuthorityArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:GatewayCertificateAuthority", name, args == null ? GatewayCertificateAuthorityArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GatewayCertificateAuthority(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:GatewayCertificateAuthority", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:GatewayCertificateAuthority").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:GatewayCertificateAuthority").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:GatewayCertificateAuthority").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:GatewayCertificateAuthority").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:GatewayCertificateAuthority").build())
            ))
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
    public static GatewayCertificateAuthority get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GatewayCertificateAuthority(name, id, options);
    }
}
