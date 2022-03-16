// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudbuild_v1.BitbucketServerConfigArgs;
import io.pulumi.googlenative.cloudbuild_v1.outputs.BitbucketServerRepositoryIdResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.BitbucketServerSecretsResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new `BitbucketServerConfig`. This API is experimental.
 * 
 */
@ResourceType(type="google-native:cloudbuild/v1:BitbucketServerConfig")
public class BitbucketServerConfig extends io.pulumi.resources.CustomResource {
    /**
     * Immutable. API Key that will be attached to webhook. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig.
     * 
     */
    @Export(name="apiKey", type=String.class, parameters={})
    private Output<String> apiKey;

    /**
     * @return Immutable. API Key that will be attached to webhook. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig.
     * 
     */
    public Output<String> getApiKey() {
        return this.apiKey;
    }
    /**
     * Connected Bitbucket Server repositories for this config.
     * 
     */
    @Export(name="connectedRepositories", type=List.class, parameters={BitbucketServerRepositoryIdResponse.class})
    private Output<List<BitbucketServerRepositoryIdResponse>> connectedRepositories;

    /**
     * @return Connected Bitbucket Server repositories for this config.
     * 
     */
    public Output<List<BitbucketServerRepositoryIdResponse>> getConnectedRepositories() {
        return this.connectedRepositories;
    }
    /**
     * Time when the config was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time when the config was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Immutable. The URI of the Bitbucket Server host. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig.
     * 
     */
    @Export(name="hostUri", type=String.class, parameters={})
    private Output<String> hostUri;

    /**
     * @return Immutable. The URI of the Bitbucket Server host. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig.
     * 
     */
    public Output<String> getHostUri() {
        return this.hostUri;
    }
    /**
     * The resource name for the config.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the config.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. The network to be used when reaching out to the Bitbucket Server instance. The VPC network must be enabled for private service connection. This should be set if the Bitbucket Server instance is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the Bitbucket Server instance will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the name of a VPC network in the project.
     * 
     */
    @Export(name="peeredNetwork", type=String.class, parameters={})
    private Output<String> peeredNetwork;

    /**
     * @return Optional. The network to be used when reaching out to the Bitbucket Server instance. The VPC network must be enabled for private service connection. This should be set if the Bitbucket Server instance is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the Bitbucket Server instance will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the name of a VPC network in the project.
     * 
     */
    public Output<String> getPeeredNetwork() {
        return this.peeredNetwork;
    }
    /**
     * Secret Manager secrets needed by the config.
     * 
     */
    @Export(name="secrets", type=BitbucketServerSecretsResponse.class, parameters={})
    private Output<BitbucketServerSecretsResponse> secrets;

    /**
     * @return Secret Manager secrets needed by the config.
     * 
     */
    public Output<BitbucketServerSecretsResponse> getSecrets() {
        return this.secrets;
    }
    /**
     * Optional. SSL certificate to use for requests to Bitbucket Server. The format should be PEM format but the extension can be one of .pem, .cer, or .crt.
     * 
     */
    @Export(name="sslCa", type=String.class, parameters={})
    private Output<String> sslCa;

    /**
     * @return Optional. SSL certificate to use for requests to Bitbucket Server. The format should be PEM format but the extension can be one of .pem, .cer, or .crt.
     * 
     */
    public Output<String> getSslCa() {
        return this.sslCa;
    }
    /**
     * Username of the account Cloud Build will use on Bitbucket Server.
     * 
     */
    @Export(name="username", type=String.class, parameters={})
    private Output<String> username;

    /**
     * @return Username of the account Cloud Build will use on Bitbucket Server.
     * 
     */
    public Output<String> getUsername() {
        return this.username;
    }
    /**
     * UUID included in webhook requests. The UUID is used to look up the corresponding config.
     * 
     */
    @Export(name="webhookKey", type=String.class, parameters={})
    private Output<String> webhookKey;

    /**
     * @return UUID included in webhook requests. The UUID is used to look up the corresponding config.
     * 
     */
    public Output<String> getWebhookKey() {
        return this.webhookKey;
    }

    public interface BuilderApplicator {
        public void apply(BitbucketServerConfigArgs.Builder a);
    }
    private static io.pulumi.googlenative.cloudbuild_v1.BitbucketServerConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.cloudbuild_v1.BitbucketServerConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BitbucketServerConfig(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BitbucketServerConfig(String name) {
        this(name, BitbucketServerConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BitbucketServerConfig(String name, BitbucketServerConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BitbucketServerConfig(String name, BitbucketServerConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudbuild/v1:BitbucketServerConfig", name, args == null ? BitbucketServerConfigArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private BitbucketServerConfig(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudbuild/v1:BitbucketServerConfig", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BitbucketServerConfig get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BitbucketServerConfig(name, id, options);
    }
}
