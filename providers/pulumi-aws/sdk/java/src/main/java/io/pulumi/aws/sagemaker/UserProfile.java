// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sagemaker.UserProfileArgs;
import io.pulumi.aws.sagemaker.inputs.UserProfileState;
import io.pulumi.aws.sagemaker.outputs.UserProfileUserSettings;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Sagemaker User Profile resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Sagemaker Code User Profiles can be imported using the `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/userProfile:UserProfile test_user_profile arn:aws:sagemaker:us-west-2:123456789012:user-profile/domain-id/profile-name
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/userProfile:UserProfile")
public class UserProfile extends io.pulumi.resources.CustomResource {
    /**
     * The user profile Amazon Resource Name (ARN).
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The user profile Amazon Resource Name (ARN).
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The ID of the associated Domain.
     * 
     */
    @Export(name="domainId", type=String.class, parameters={})
    private Output<String> domainId;

    /**
     * @return The ID of the associated Domain.
     * 
     */
    public Output<String> getDomainId() {
        return this.domainId;
    }
    /**
     * The ID of the user's profile in the Amazon Elastic File System (EFS) volume.
     * 
     */
    @Export(name="homeEfsFileSystemUid", type=String.class, parameters={})
    private Output<String> homeEfsFileSystemUid;

    /**
     * @return The ID of the user's profile in the Amazon Elastic File System (EFS) volume.
     * 
     */
    public Output<String> getHomeEfsFileSystemUid() {
        return this.homeEfsFileSystemUid;
    }
    /**
     * A specifier for the type of value specified in `single_sign_on_user_value`. Currently, the only supported value is `UserName`. If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified.
     * 
     */
    @Export(name="singleSignOnUserIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> singleSignOnUserIdentifier;

    /**
     * @return A specifier for the type of value specified in `single_sign_on_user_value`. Currently, the only supported value is `UserName`. If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified.
     * 
     */
    public Output</* @Nullable */ String> getSingleSignOnUserIdentifier() {
        return this.singleSignOnUserIdentifier;
    }
    /**
     * The username of the associated AWS Single Sign-On User for this User Profile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified.
     * 
     */
    @Export(name="singleSignOnUserValue", type=String.class, parameters={})
    private Output</* @Nullable */ String> singleSignOnUserValue;

    /**
     * @return The username of the associated AWS Single Sign-On User for this User Profile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified.
     * 
     */
    public Output</* @Nullable */ String> getSingleSignOnUserValue() {
        return this.singleSignOnUserValue;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The name for the User Profile.
     * 
     */
    @Export(name="userProfileName", type=String.class, parameters={})
    private Output<String> userProfileName;

    /**
     * @return The name for the User Profile.
     * 
     */
    public Output<String> getUserProfileName() {
        return this.userProfileName;
    }
    /**
     * The user settings. See User Settings below.
     * 
     */
    @Export(name="userSettings", type=UserProfileUserSettings.class, parameters={})
    private Output</* @Nullable */ UserProfileUserSettings> userSettings;

    /**
     * @return The user settings. See User Settings below.
     * 
     */
    public Output</* @Nullable */ UserProfileUserSettings> getUserSettings() {
        return this.userSettings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserProfile(String name) {
        this(name, UserProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserProfile(String name, UserProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserProfile(String name, UserProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/userProfile:UserProfile", name, args == null ? UserProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserProfile(String name, Output<String> id, @Nullable UserProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/userProfile:UserProfile", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static UserProfile get(String name, Output<String> id, @Nullable UserProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UserProfile(name, id, state, options);
    }
}
