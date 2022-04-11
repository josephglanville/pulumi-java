// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.UserArgs;
import io.pulumi.azurenative.databoxedge.outputs.AsymmetricEncryptedSecretResponse;
import io.pulumi.azurenative.databoxedge.outputs.ShareAccessRightResponse;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a user who has access to one or more shares on the Data Box Edge/Gateway device.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:databoxedge:User user1 /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/GroupForEdgeAutomation/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/testedgedevice/users/user1 
 * ```
 * 
 */
@ResourceType(type="azure-native:databoxedge:User")
public class User extends io.pulumi.resources.CustomResource {
    /**
     * The password details.
     * 
     */
    @Export(name="encryptedPassword", type=AsymmetricEncryptedSecretResponse.class, parameters={})
    private Output</* @Nullable */ AsymmetricEncryptedSecretResponse> encryptedPassword;

    /**
     * @return The password details.
     * 
     */
    public Output</* @Nullable */ AsymmetricEncryptedSecretResponse> getEncryptedPassword() {
        return this.encryptedPassword;
    }
    /**
     * The object name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The object name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * List of shares that the user has rights on. This field should not be specified during user creation.
     * 
     */
    @Export(name="shareAccessRights", type=List.class, parameters={ShareAccessRightResponse.class})
    private Output<List<ShareAccessRightResponse>> shareAccessRights;

    /**
     * @return List of shares that the user has rights on. This field should not be specified during user creation.
     * 
     */
    public Output<List<ShareAccessRightResponse>> getShareAccessRights() {
        return this.shareAccessRights;
    }
    /**
     * User in DataBoxEdge Resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return User in DataBoxEdge Resource
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Type of the user.
     * 
     */
    @Export(name="userType", type=String.class, parameters={})
    private Output<String> userType;

    /**
     * @return Type of the user.
     * 
     */
    public Output<String> getUserType() {
        return this.userType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(String name, UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, UserArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private User(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:User", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190301:User").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190701:User").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190801:User").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200501preview:User").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200901:User").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200901preview:User").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20201201:User").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210201:User").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210201preview:User").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210601:User").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210601preview:User").build())
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
    public static User get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, options);
    }
}
