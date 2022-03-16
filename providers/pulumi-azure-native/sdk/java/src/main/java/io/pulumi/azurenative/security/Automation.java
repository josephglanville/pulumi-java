// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.security.AutomationArgs;
import io.pulumi.azurenative.security.outputs.AutomationActionEventHubResponse;
import io.pulumi.azurenative.security.outputs.AutomationActionLogicAppResponse;
import io.pulumi.azurenative.security.outputs.AutomationActionWorkspaceResponse;
import io.pulumi.azurenative.security.outputs.AutomationScopeResponse;
import io.pulumi.azurenative.security.outputs.AutomationSourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The security automation resource.
 * API Version: 2019-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:security:Automation exampleAutomation /subscriptions/a5caac9c-5c04-49af-b3d0-e204f40345d5/resourceGroups/exampleResourceGroup/providers/Microsoft.Security/SecurityAutomations/exampleAutomation 
 * ```
 * 
 */
@ResourceType(type="azure-native:security:Automation")
public class Automation extends io.pulumi.resources.CustomResource {
    /**
     * A collection of the actions which are triggered if all the configured rules evaluations, within at least one rule set, are true.
     * 
     */
    @Export(name="actions", type=List.class, parameters={Object.class})
    private Output</* @Nullable */ List<Object>> actions;

    /**
     * @return A collection of the actions which are triggered if all the configured rules evaluations, within at least one rule set, are true.
     * 
     */
    public Output</* @Nullable */ List<Object>> getActions() {
        return this.actions;
    }
    /**
     * The security automation description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The security automation description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Entity tag is used for comparing two or more entities from the same requested resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Entity tag is used for comparing two or more entities from the same requested resource.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Indicates whether the security automation is enabled.
     * 
     */
    @Export(name="isEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isEnabled;

    /**
     * @return Indicates whether the security automation is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Kind of the resource
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of the resource
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Location where the resource is stored
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location where the resource is stored
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A collection of scopes on which the security automations logic is applied. Supported scopes are the subscription itself or a resource group under that subscription. The automation will only apply on defined scopes.
     * 
     */
    @Export(name="scopes", type=List.class, parameters={AutomationScopeResponse.class})
    private Output</* @Nullable */ List<AutomationScopeResponse>> scopes;

    /**
     * @return A collection of scopes on which the security automations logic is applied. Supported scopes are the subscription itself or a resource group under that subscription. The automation will only apply on defined scopes.
     * 
     */
    public Output</* @Nullable */ List<AutomationScopeResponse>> getScopes() {
        return this.scopes;
    }
    /**
     * A collection of the source event types which evaluate the security automation set of rules.
     * 
     */
    @Export(name="sources", type=List.class, parameters={AutomationSourceResponse.class})
    private Output</* @Nullable */ List<AutomationSourceResponse>> sources;

    /**
     * @return A collection of the source event types which evaluate the security automation set of rules.
     * 
     */
    public Output</* @Nullable */ List<AutomationSourceResponse>> getSources() {
        return this.sources;
    }
    /**
     * A list of key value pairs that describe the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A list of key value pairs that describe the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(AutomationArgs.Builder a);
    }
    private static io.pulumi.azurenative.security.AutomationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.security.AutomationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Automation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Automation(String name) {
        this(name, AutomationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Automation(String name, AutomationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Automation(String name, AutomationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:Automation", name, args == null ? AutomationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Automation(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:Automation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:security/v20190101preview:Automation").build())
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
    public static Automation get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Automation(name, id, options);
    }
}
