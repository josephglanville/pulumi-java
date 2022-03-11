// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.GroupUserArgs;
import io.pulumi.azurenative.apimanagement.outputs.GroupContractPropertiesResponse;
import io.pulumi.azurenative.apimanagement.outputs.UserIdentityContractResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * User details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:GroupUser 59307d350af58404d8a26300 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/users/59307d350af58404d8a26300 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:GroupUser")
public class GroupUser extends io.pulumi.resources.CustomResource {
    /**
     * Email address.
     * 
     */
    @OutputExport(name="email", type=String.class, parameters={})
    private Output</* @Nullable */ String> email;

    /**
     * @return Email address.
     * 
     */
    public Output</* @Nullable */ String> getEmail() {
        return this.email;
    }
    /**
     * First name.
     * 
     */
    @OutputExport(name="firstName", type=String.class, parameters={})
    private Output</* @Nullable */ String> firstName;

    /**
     * @return First name.
     * 
     */
    public Output</* @Nullable */ String> getFirstName() {
        return this.firstName;
    }
    /**
     * Collection of groups user is part of.
     * 
     */
    @OutputExport(name="groups", type=List.class, parameters={GroupContractPropertiesResponse.class})
    private Output<List<GroupContractPropertiesResponse>> groups;

    /**
     * @return Collection of groups user is part of.
     * 
     */
    public Output<List<GroupContractPropertiesResponse>> getGroups() {
        return this.groups;
    }
    /**
     * Collection of user identities.
     * 
     */
    @OutputExport(name="identities", type=List.class, parameters={UserIdentityContractResponse.class})
    private Output</* @Nullable */ List<UserIdentityContractResponse>> identities;

    /**
     * @return Collection of user identities.
     * 
     */
    public Output</* @Nullable */ List<UserIdentityContractResponse>> getIdentities() {
        return this.identities;
    }
    /**
     * Last name.
     * 
     */
    @OutputExport(name="lastName", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastName;

    /**
     * @return Last name.
     * 
     */
    public Output</* @Nullable */ String> getLastName() {
        return this.lastName;
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
     * Optional note about a user set by the administrator.
     * 
     */
    @OutputExport(name="note", type=String.class, parameters={})
    private Output</* @Nullable */ String> note;

    /**
     * @return Optional note about a user set by the administrator.
     * 
     */
    public Output</* @Nullable */ String> getNote() {
        return this.note;
    }
    /**
     * Date of user registration. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    @OutputExport(name="registrationDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> registrationDate;

    /**
     * @return Date of user registration. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    public Output</* @Nullable */ String> getRegistrationDate() {
        return this.registrationDate;
    }
    /**
     * Account state. Specifies whether the user is active or not. Blocked users are unable to sign into the developer portal or call any APIs of subscribed products. Default state is Active.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output</* @Nullable */ String> state;

    /**
     * @return Account state. Specifies whether the user is active or not. Blocked users are unable to sign into the developer portal or call any APIs of subscribed products. Default state is Active.
     * 
     */
    public Output</* @Nullable */ String> getState() {
        return this.state;
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

    public interface BuilderApplicator {
        public void apply(GroupUserArgs.Builder a);
    }
    private static io.pulumi.azurenative.apimanagement.GroupUserArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.apimanagement.GroupUserArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public GroupUser(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GroupUser(String name) {
        this(name, GroupUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GroupUser(String name, GroupUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupUser(String name, GroupUserArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:GroupUser", name, args == null ? GroupUserArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private GroupUser(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:GroupUser", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20170301:GroupUser").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20180101:GroupUser").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:GroupUser").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20190101:GroupUser").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20191201:GroupUser").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:GroupUser").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:GroupUser").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20201201:GroupUser").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:GroupUser").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:GroupUser").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20210801:GroupUser").build())
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
    public static GroupUser get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GroupUser(name, id, options);
    }
}
