// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.orbital.SpacecraftArgs;
import io.pulumi.azurenative.orbital.outputs.SpacecraftLinkResponse;
import io.pulumi.azurenative.orbital.outputs.SystemDataResponse;
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
 * Customer creates a spacecraft resource to schedule a contact.
 * API Version: 2021-04-04-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:orbital:Spacecraft AQUA /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Orbital/spacecrafts/AQUA 
 * ```
 * 
 */
@ResourceType(type="azure-native:orbital:Spacecraft")
public class Spacecraft extends io.pulumi.resources.CustomResource {
    /**
     * Authorization status of spacecraft.
     * 
     */
    @OutputExport(name="authorizationStatus", type=String.class, parameters={})
    private Output<String> authorizationStatus;

    /**
     * @return Authorization status of spacecraft.
     * 
     */
    public Output<String> getAuthorizationStatus() {
        return this.authorizationStatus;
    }
    /**
     * Details of the authorization status.
     * 
     */
    @OutputExport(name="authorizationStatusExtended", type=String.class, parameters={})
    private Output<String> authorizationStatusExtended;

    /**
     * @return Details of the authorization status.
     * 
     */
    public Output<String> getAuthorizationStatusExtended() {
        return this.authorizationStatusExtended;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Links of the Spacecraft
     * 
     */
    @OutputExport(name="links", type=List.class, parameters={SpacecraftLinkResponse.class})
    private Output</* @Nullable */ List<SpacecraftLinkResponse>> links;

    /**
     * @return Links of the Spacecraft
     * 
     */
    public Output</* @Nullable */ List<SpacecraftLinkResponse>> getLinks() {
        return this.links;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * NORAD ID of the spacecraft.
     * 
     */
    @OutputExport(name="noradId", type=String.class, parameters={})
    private Output<String> noradId;

    /**
     * @return NORAD ID of the spacecraft.
     * 
     */
    public Output<String> getNoradId() {
        return this.noradId;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
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
     * Title line of Two Line Element (TLE).
     * 
     */
    @OutputExport(name="titleLine", type=String.class, parameters={})
    private Output</* @Nullable */ String> titleLine;

    /**
     * @return Title line of Two Line Element (TLE).
     * 
     */
    public Output</* @Nullable */ String> getTitleLine() {
        return this.titleLine;
    }
    /**
     * Line 1 of Two Line Element (TLE).
     * 
     */
    @OutputExport(name="tleLine1", type=String.class, parameters={})
    private Output</* @Nullable */ String> tleLine1;

    /**
     * @return Line 1 of Two Line Element (TLE).
     * 
     */
    public Output</* @Nullable */ String> getTleLine1() {
        return this.tleLine1;
    }
    /**
     * Line 2 of Two Line Element (TLE).
     * 
     */
    @OutputExport(name="tleLine2", type=String.class, parameters={})
    private Output</* @Nullable */ String> tleLine2;

    /**
     * @return Line 2 of Two Line Element (TLE).
     * 
     */
    public Output</* @Nullable */ String> getTleLine2() {
        return this.tleLine2;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Spacecraft(String name) {
        this(name, SpacecraftArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Spacecraft(String name, SpacecraftArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Spacecraft(String name, SpacecraftArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:orbital:Spacecraft", name, args == null ? SpacecraftArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Spacecraft(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:orbital:Spacecraft", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:orbital/v20210404preview:Spacecraft").build())
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
    public static Spacecraft get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Spacecraft(name, id, options);
    }
}
