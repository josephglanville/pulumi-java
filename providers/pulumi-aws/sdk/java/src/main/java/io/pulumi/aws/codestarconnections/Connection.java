// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codestarconnections;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.codestarconnections.ConnectionArgs;
import io.pulumi.aws.codestarconnections.inputs.ConnectionState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a CodeStar Connection.
 * 
 * > **NOTE:** The `aws.codestarconnections.Connection` resource is created in the state `PENDING`. Authentication with the connection provider must be completed in the AWS Console.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CodeStar connections can be imported using the ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:codestarconnections/connection:Connection test-connection arn:aws:codestar-connections:us-west-1:0123456789:connection/79d4d357-a2ee-41e4-b350-2fe39ae59448
 * ```
 * 
 */
@ResourceType(type="aws:codestarconnections/connection:Connection")
public class Connection extends io.pulumi.resources.CustomResource {
    /**
     * The codestar connection ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The codestar connection ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The codestar connection status. Possible values are `PENDING`, `AVAILABLE` and `ERROR`.
     * 
     */
    @Export(name="connectionStatus", type=String.class, parameters={})
    private Output<String> connectionStatus;

    /**
     * @return The codestar connection status. Possible values are `PENDING`, `AVAILABLE` and `ERROR`.
     * 
     */
    public Output<String> getConnectionStatus() {
        return this.connectionStatus;
    }
    /**
     * The Amazon Resource Name (ARN) of the host associated with the connection. Conflicts with `provider_type`
     * 
     */
    @Export(name="hostArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostArn;

    /**
     * @return The Amazon Resource Name (ARN) of the host associated with the connection. Conflicts with `provider_type`
     * 
     */
    public Output</* @Nullable */ String> getHostArn() {
        return this.hostArn;
    }
    /**
     * The name of the connection to be created. The name must be unique in the calling AWS account. Changing `name` will create a new resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the connection to be created. The name must be unique in the calling AWS account. Changing `name` will create a new resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The name of the external provider where your third-party code repository is configured. Valid values are `Bitbucket`, `GitHub` or `GitHubEnterpriseServer`. Changing `provider_type` will create a new resource. Conflicts with `host_arn`
     * 
     */
    @Export(name="providerType", type=String.class, parameters={})
    private Output<String> providerType;

    /**
     * @return The name of the external provider where your third-party code repository is configured. Valid values are `Bitbucket`, `GitHub` or `GitHubEnterpriseServer`. Changing `provider_type` will create a new resource. Conflicts with `host_arn`
     * 
     */
    public Output<String> getProviderType() {
        return this.providerType;
    }
    /**
     * Map of key-value resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of key-value resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connection(String name) {
        this(name, ConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connection(String name, @Nullable ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(String name, @Nullable ConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codestarconnections/connection:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Connection(String name, Output<String> id, @Nullable ConnectionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codestarconnections/connection:Connection", name, state, makeResourceOptions(options, id));
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
    public static Connection get(String name, Output<String> id, @Nullable ConnectionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, state, options);
    }
}