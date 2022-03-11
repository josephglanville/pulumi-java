// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.diagflow.CxFlowArgs;
import io.pulumi.gcp.diagflow.inputs.CxFlowState;
import io.pulumi.gcp.diagflow.outputs.CxFlowEventHandler;
import io.pulumi.gcp.diagflow.outputs.CxFlowNluSettings;
import io.pulumi.gcp.diagflow.outputs.CxFlowTransitionRoute;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Flows represents the conversation flows when you build your chatbot agent.
 * 
 * To get more information about Flow, see:
 * 
 * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.flows)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Flow can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxFlow:CxFlow default {{parent}}/flows/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxFlow:CxFlow default {{parent}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:diagflow/cxFlow:CxFlow")
public class CxFlow extends io.pulumi.resources.CustomResource {
    /**
     * The description of the flow. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the flow. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The human-readable name of the flow.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the flow.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * A flow's event handlers serve two purposes:
     * They are responsible for handling events (e.g. no match, webhook errors) in the flow.
     * They are inherited by every page's [event handlers][Page.event_handlers], which can be used to handle common events regardless of the current page. Event handlers defined in the page have higher priority than those defined in the flow.
     * Unlike transitionRoutes, these handlers are evaluated on a first-match basis. The first one that matches the event get executed, with the rest being ignored.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="eventHandlers", type=List.class, parameters={CxFlowEventHandler.class})
    private Output<List<CxFlowEventHandler>> eventHandlers;

    /**
     * @return A flow's event handlers serve two purposes:
     * They are responsible for handling events (e.g. no match, webhook errors) in the flow.
     * They are inherited by every page's [event handlers][Page.event_handlers], which can be used to handle common events regardless of the current page. Event handlers defined in the page have higher priority than those defined in the flow.
     * Unlike transitionRoutes, these handlers are evaluated on a first-match basis. The first one that matches the event get executed, with the rest being ignored.
     * Structure is documented below.
     * 
     */
    public Output<List<CxFlowEventHandler>> getEventHandlers() {
        return this.eventHandlers;
    }
    /**
     * The language of the following fields in flow:
     * Flow.event_handlers.trigger_fulfillment.messages
     * Flow.event_handlers.trigger_fulfillment.conditional_cases
     * Flow.transition_routes.trigger_fulfillment.messages
     * Flow.transition_routes.trigger_fulfillment.conditional_cases
     * If not specified, the agent's default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    @OutputExport(name="languageCode", type=String.class, parameters={})
    private Output</* @Nullable */ String> languageCode;

    /**
     * @return The language of the following fields in flow:
     * Flow.event_handlers.trigger_fulfillment.messages
     * Flow.event_handlers.trigger_fulfillment.conditional_cases
     * Flow.transition_routes.trigger_fulfillment.messages
     * Flow.transition_routes.trigger_fulfillment.conditional_cases
     * If not specified, the agent's default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    public Output</* @Nullable */ String> getLanguageCode() {
        return this.languageCode;
    }
    /**
     * - 
     * The unique identifier of this event handler.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return -
     * The unique identifier of this event handler.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * NLU related settings of the flow.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="nluSettings", type=CxFlowNluSettings.class, parameters={})
    private Output</* @Nullable */ CxFlowNluSettings> nluSettings;

    /**
     * @return NLU related settings of the flow.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ CxFlowNluSettings> getNluSettings() {
        return this.nluSettings;
    }
    /**
     * The agent to create a flow for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
     * 
     */
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output</* @Nullable */ String> parent;

    /**
     * @return The agent to create a flow for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
     * 
     */
    public Output</* @Nullable */ String> getParent() {
        return this.parent;
    }
    /**
     * A flow's transition route group serve two purposes:
     * They are responsible for matching the user's first utterances in the flow.
     * They are inherited by every page's [transition route groups][Page.transition_route_groups]. Transition route groups defined in the page have higher priority than those defined in the flow.
     * Format:projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>/transitionRouteGroups/<TransitionRouteGroup ID>.
     * 
     */
    @OutputExport(name="transitionRouteGroups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> transitionRouteGroups;

    /**
     * @return A flow's transition route group serve two purposes:
     * They are responsible for matching the user's first utterances in the flow.
     * They are inherited by every page's [transition route groups][Page.transition_route_groups]. Transition route groups defined in the page have higher priority than those defined in the flow.
     * Format:projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>/transitionRouteGroups/<TransitionRouteGroup ID>.
     * 
     */
    public Output</* @Nullable */ List<String>> getTransitionRouteGroups() {
        return this.transitionRouteGroups;
    }
    /**
     * A flow's transition routes serve two purposes:
     * They are responsible for matching the user's first utterances in the flow.
     * They are inherited by every page's [transition routes][Page.transition_routes] and can support use cases such as the user saying "help" or "can I talk to a human?", which can be handled in a common way regardless of the current page. Transition routes defined in the page have higher priority than those defined in the flow.
     * 
     */
    @OutputExport(name="transitionRoutes", type=List.class, parameters={CxFlowTransitionRoute.class})
    private Output</* @Nullable */ List<CxFlowTransitionRoute>> transitionRoutes;

    /**
     * @return A flow's transition routes serve two purposes:
     * They are responsible for matching the user's first utterances in the flow.
     * They are inherited by every page's [transition routes][Page.transition_routes] and can support use cases such as the user saying "help" or "can I talk to a human?", which can be handled in a common way regardless of the current page. Transition routes defined in the page have higher priority than those defined in the flow.
     * 
     */
    public Output</* @Nullable */ List<CxFlowTransitionRoute>> getTransitionRoutes() {
        return this.transitionRoutes;
    }

    public interface BuilderApplicator {
        public void apply(CxFlowArgs.Builder a);
    }
    private static io.pulumi.gcp.diagflow.CxFlowArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.diagflow.CxFlowArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CxFlow(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CxFlow(String name) {
        this(name, CxFlowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CxFlow(String name, CxFlowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CxFlow(String name, CxFlowArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxFlow:CxFlow", name, args == null ? CxFlowArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private CxFlow(String name, Output<String> id, @Nullable CxFlowState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxFlow:CxFlow", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CxFlow get(String name, Output<String> id, @Nullable CxFlowState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CxFlow(name, id, state, options);
    }
}
