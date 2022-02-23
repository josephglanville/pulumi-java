// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.ProfileArgs;
import io.pulumi.azurenative.cdn.outputs.SkuResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * CDN profile is a logical grouping of endpoints that share the same settings, such as CDN provider and pricing tier.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cdn:Profile profile1 /subscriptions/subid/resourcegroups/RG/providers/Microsoft.Cdn/profiles/profile1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cdn:Profile")
public class Profile extends io.pulumi.resources.CustomResource {
    /**
     * The Id of the frontdoor.
     * 
     */
    @OutputExport(name="frontdoorId", type=String.class, parameters={})
    private Output<String> frontdoorId;

    /**
     * @return The Id of the frontdoor.
     * 
     */
    public Output<String> getFrontdoorId() {
        return this.frontdoorId;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
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
     * Provisioning status of the profile.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning status of the profile.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource status of the profile.
     * 
     */
    @OutputExport(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    /**
     * @return Resource status of the profile.
     * 
     */
    public Output<String> getResourceState() {
        return this.resourceState;
    }
    /**
     * The pricing tier (defines a CDN provider, feature list and rate) of the CDN profile.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return The pricing tier (defines a CDN provider, feature list and rate) of the CDN profile.
     * 
     */
    public Output<SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Read only system data
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Profile(String name) {
        this(name, ProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Profile(String name, ProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Profile(String name, ProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Profile", name, args == null ? ProfileArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Profile(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Profile", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:cdn/v20150601:Profile").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20160402:Profile").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20161002:Profile").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20170402:Profile").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20171012:Profile").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20190415:Profile").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20190615:Profile").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20190615preview:Profile").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20191231:Profile").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20200331:Profile").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20200415:Profile").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20200901:Profile").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20210601:Profile").build())
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
    public static Profile get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Profile(name, id, options);
    }
}
