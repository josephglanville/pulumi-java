// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.projects.ServiceIdentityArgs;
import io.pulumi.gcp.projects.inputs.ServiceIdentityState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Generate service identity for a service.
 * 
 * > **Note**: Once created, this resource cannot be updated or destroyed. These
 * actions are a no-op.
 * 
 * > **Note**: This resource can be used to retrieve the emails of the [Google-managed service accounts](https://cloud.google.com/iam/docs/service-agents)
 * of the APIs that Google has configured with a Service Identity. You can run `gcloud beta services identity create --service SERVICE_NAME.googleapis.com` to
 * verify if an API supports this.
 * 
 * To get more information about Service Identity, see:
 * 
 * * [API documentation](https://cloud.google.com/service-usage/docs/reference/rest/v1beta1/services/generateServiceIdentity)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:projects/serviceIdentity:ServiceIdentity")
public class ServiceIdentity extends io.pulumi.resources.CustomResource {
    /**
     * The email address of the Google managed service account.
     * 
     */
    @Export(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return The email address of the Google managed service account.
     * 
     */
    public Output<String> getEmail() {
        return this.email;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The service to generate identity for.
     * 
     */
    @Export(name="service", type=String.class, parameters={})
    private Output<String> service;

    /**
     * @return The service to generate identity for.
     * 
     */
    public Output<String> getService() {
        return this.service;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceIdentity(String name) {
        this(name, ServiceIdentityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceIdentity(String name, ServiceIdentityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceIdentity(String name, ServiceIdentityArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:projects/serviceIdentity:ServiceIdentity", name, args == null ? ServiceIdentityArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceIdentity(String name, Output<String> id, @Nullable ServiceIdentityState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:projects/serviceIdentity:ServiceIdentity", name, state, makeResourceOptions(options, id));
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
    public static ServiceIdentity get(String name, Output<String> id, @Nullable ServiceIdentityState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServiceIdentity(name, id, state, options);
    }
}
