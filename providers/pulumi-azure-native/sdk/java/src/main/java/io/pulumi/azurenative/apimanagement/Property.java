// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.PropertyArgs;
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
 * Property details.
 * API Version: 2019-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:Property testprop2 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/properties/testprop2 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:Property")
public class Property extends io.pulumi.resources.CustomResource {
    /**
     * Unique name of Property. It may contain only letters, digits, period, dash, and underscore characters.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Unique name of Property. It may contain only letters, digits, period, dash, and underscore characters.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
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
     * Determines whether the value is a secret and should be encrypted or not. Default value is false.
     * 
     */
    @OutputExport(name="secret", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> secret;

    /**
     * @return Determines whether the value is a secret and should be encrypted or not. Default value is false.
     * 
     */
    public Output</* @Nullable */ Boolean> getSecret() {
        return this.secret;
    }
    /**
     * Optional tags that when provided can be used to filter the property list.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Optional tags that when provided can be used to filter the property list.
     * 
     */
    public Output</* @Nullable */ List<String>> getTags() {
        return this.tags;
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
     * Value of the property. Can contain policy expressions. It may not be empty or consist only of whitespace.
     * 
     */
    @OutputExport(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return Value of the property. Can contain policy expressions. It may not be empty or consist only of whitespace.
     * 
     */
    public Output<String> getValue() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Property(String name) {
        this(name, PropertyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Property(String name, PropertyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Property(String name, PropertyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Property", name, args == null ? PropertyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Property(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Property", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20160707:Property").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20161010:Property").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20170301:Property").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180101:Property").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:Property").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20190101:Property").build())
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
    public static Property get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Property(name, id, options);
    }
}
