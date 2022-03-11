// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.ContainerAppArgs;
import io.pulumi.azurenative.web.outputs.ConfigurationResponse;
import io.pulumi.azurenative.web.outputs.TemplateResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Container App.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:ContainerApp testcontainerApp0 /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/rg/providers/Microsoft.Web/containerApps/testcontainerApp0 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:ContainerApp")
public class ContainerApp extends io.pulumi.resources.CustomResource {
    /**
     * Non versioned Container App configuration properties.
     * 
     */
    @OutputExport(name="configuration", type=ConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ ConfigurationResponse> configuration;

    /**
     * @return Non versioned Container App configuration properties.
     * 
     */
    public Output</* @Nullable */ ConfigurationResponse> getConfiguration() {
        return this.configuration;
    }
    /**
     * Kind of resource.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Resource ID of the Container App's KubeEnvironment.
     * 
     */
    @OutputExport(name="kubeEnvironmentId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kubeEnvironmentId;

    /**
     * @return Resource ID of the Container App's KubeEnvironment.
     * 
     */
    public Output</* @Nullable */ String> getKubeEnvironmentId() {
        return this.kubeEnvironmentId;
    }
    /**
     * Fully Qualified Domain Name of the latest revision of the Container App.
     * 
     */
    @OutputExport(name="latestRevisionFqdn", type=String.class, parameters={})
    private Output<String> latestRevisionFqdn;

    /**
     * @return Fully Qualified Domain Name of the latest revision of the Container App.
     * 
     */
    public Output<String> getLatestRevisionFqdn() {
        return this.latestRevisionFqdn;
    }
    /**
     * Name of the latest revision of the Container App.
     * 
     */
    @OutputExport(name="latestRevisionName", type=String.class, parameters={})
    private Output<String> latestRevisionName;

    /**
     * @return Name of the latest revision of the Container App.
     * 
     */
    public Output<String> getLatestRevisionName() {
        return this.latestRevisionName;
    }
    /**
     * Resource Location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource Location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource Name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Provisioning state of the Container App.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the Container App.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
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
     * Container App versioned application definition.
     * 
     */
    @OutputExport(name="template", type=TemplateResponse.class, parameters={})
    private Output</* @Nullable */ TemplateResponse> template;

    /**
     * @return Container App versioned application definition.
     * 
     */
    public Output</* @Nullable */ TemplateResponse> getTemplate() {
        return this.template;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ContainerAppArgs.Builder a);
    }
    private static io.pulumi.azurenative.web.ContainerAppArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.web.ContainerAppArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ContainerApp(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContainerApp(String name) {
        this(name, ContainerAppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContainerApp(String name, ContainerAppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContainerApp(String name, ContainerAppArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:ContainerApp", name, args == null ? ContainerAppArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ContainerApp(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:ContainerApp", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:web/v20210301:ContainerApp").build())
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
    public static ContainerApp get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ContainerApp(name, id, options);
    }
}
