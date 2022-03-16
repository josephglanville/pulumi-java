// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.opsworks.UserProfileArgs;
import io.pulumi.aws.opsworks.inputs.UserProfileState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an OpsWorks User Profile resource.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:opsworks/userProfile:UserProfile")
public class UserProfile extends io.pulumi.resources.CustomResource {
    /**
     * Whether users can specify their own SSH public key through the My Settings page
     * 
     */
    @Export(name="allowSelfManagement", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowSelfManagement;

    /**
     * @return Whether users can specify their own SSH public key through the My Settings page
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowSelfManagement() {
        return this.allowSelfManagement;
    }
    /**
     * The users public key
     * 
     */
    @Export(name="sshPublicKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> sshPublicKey;

    /**
     * @return The users public key
     * 
     */
    public Output</* @Nullable */ String> getSshPublicKey() {
        return this.sshPublicKey;
    }
    /**
     * The ssh username, with witch this user wants to log in
     * 
     */
    @Export(name="sshUsername", type=String.class, parameters={})
    private Output<String> sshUsername;

    /**
     * @return The ssh username, with witch this user wants to log in
     * 
     */
    public Output<String> getSshUsername() {
        return this.sshUsername;
    }
    /**
     * The user's IAM ARN
     * 
     */
    @Export(name="userArn", type=String.class, parameters={})
    private Output<String> userArn;

    /**
     * @return The user's IAM ARN
     * 
     */
    public Output<String> getUserArn() {
        return this.userArn;
    }

    public interface BuilderApplicator {
        public void apply(UserProfileArgs.Builder a);
    }
    private static io.pulumi.aws.opsworks.UserProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.opsworks.UserProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public UserProfile(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
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
        super("aws:opsworks/userProfile:UserProfile", name, args == null ? UserProfileArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private UserProfile(String name, Output<String> id, @Nullable UserProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:opsworks/userProfile:UserProfile", name, state, makeResourceOptions(options, id));
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
