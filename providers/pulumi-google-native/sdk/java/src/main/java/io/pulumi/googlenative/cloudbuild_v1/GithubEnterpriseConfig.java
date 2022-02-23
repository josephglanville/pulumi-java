// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudbuild_v1.GithubEnterpriseConfigArgs;
import io.pulumi.googlenative.cloudbuild_v1.outputs.GitHubEnterpriseSecretsResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Create an association between a GCP project and a GitHub Enterprise server.
 * 
 */
@ResourceType(type="google-native:cloudbuild/v1:GithubEnterpriseConfig")
public class GithubEnterpriseConfig extends io.pulumi.resources.CustomResource {
    /**
     * The GitHub app id of the Cloud Build app on the GitHub Enterprise server.
     * 
     */
    @OutputExport(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    /**
     * @return The GitHub app id of the Cloud Build app on the GitHub Enterprise server.
     * 
     */
    public Output<String> getAppId() {
        return this.appId;
    }
    /**
     * Time when the installation was associated with the project.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time when the installation was associated with the project.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Name to display for this config.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Name to display for this config.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The URL of the github enterprise host the configuration is for.
     * 
     */
    @OutputExport(name="hostUrl", type=String.class, parameters={})
    private Output<String> hostUrl;

    /**
     * @return The URL of the github enterprise host the configuration is for.
     * 
     */
    public Output<String> getHostUrl() {
        return this.hostUrl;
    }
    /**
     * Optional. The full resource name for the GitHubEnterpriseConfig For example: "projects/{$project_id}/githubEnterpriseConfigs/{$config_id}"
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Optional. The full resource name for the GitHubEnterpriseConfig For example: "projects/{$project_id}/githubEnterpriseConfigs/{$config_id}"
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. The network to be used when reaching out to the GitHub Enterprise server. The VPC network must be enabled for private service connection. This should be set if the GitHub Enterprise server is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the GitHub Enterprise server will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the name of a VPC network in the project.
     * 
     */
    @OutputExport(name="peeredNetwork", type=String.class, parameters={})
    private Output<String> peeredNetwork;

    /**
     * @return Optional. The network to be used when reaching out to the GitHub Enterprise server. The VPC network must be enabled for private service connection. This should be set if the GitHub Enterprise server is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the GitHub Enterprise server will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the name of a VPC network in the project.
     * 
     */
    public Output<String> getPeeredNetwork() {
        return this.peeredNetwork;
    }
    /**
     * Names of secrets in Secret Manager.
     * 
     */
    @OutputExport(name="secrets", type=GitHubEnterpriseSecretsResponse.class, parameters={})
    private Output<GitHubEnterpriseSecretsResponse> secrets;

    /**
     * @return Names of secrets in Secret Manager.
     * 
     */
    public Output<GitHubEnterpriseSecretsResponse> getSecrets() {
        return this.secrets;
    }
    /**
     * Optional. SSL certificate to use for requests to GitHub Enterprise.
     * 
     */
    @OutputExport(name="sslCa", type=String.class, parameters={})
    private Output<String> sslCa;

    /**
     * @return Optional. SSL certificate to use for requests to GitHub Enterprise.
     * 
     */
    public Output<String> getSslCa() {
        return this.sslCa;
    }
    /**
     * The key that should be attached to webhook calls to the ReceiveWebhook endpoint.
     * 
     */
    @OutputExport(name="webhookKey", type=String.class, parameters={})
    private Output<String> webhookKey;

    /**
     * @return The key that should be attached to webhook calls to the ReceiveWebhook endpoint.
     * 
     */
    public Output<String> getWebhookKey() {
        return this.webhookKey;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GithubEnterpriseConfig(String name) {
        this(name, GithubEnterpriseConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GithubEnterpriseConfig(String name, GithubEnterpriseConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GithubEnterpriseConfig(String name, GithubEnterpriseConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudbuild/v1:GithubEnterpriseConfig", name, args == null ? GithubEnterpriseConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GithubEnterpriseConfig(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudbuild/v1:GithubEnterpriseConfig", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static GithubEnterpriseConfig get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GithubEnterpriseConfig(name, id, options);
    }
}
