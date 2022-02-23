// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ssmincidents.ResponsePlanArgs;
import io.pulumi.awsnative.ssmincidents.outputs.ResponsePlanAction;
import io.pulumi.awsnative.ssmincidents.outputs.ResponsePlanChatChannel;
import io.pulumi.awsnative.ssmincidents.outputs.ResponsePlanIncidentTemplate;
import io.pulumi.awsnative.ssmincidents.outputs.ResponsePlanTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource type definition for AWS::SSMIncidents::ResponsePlan
 * 
 */
@ResourceType(type="aws-native:ssmincidents:ResponsePlan")
public class ResponsePlan extends io.pulumi.resources.CustomResource {
    /**
     * The list of actions.
     * 
     */
    @OutputExport(name="actions", type=List.class, parameters={ResponsePlanAction.class})
    private Output</* @Nullable */ List<ResponsePlanAction>> actions;

    /**
     * @return The list of actions.
     * 
     */
    public Output</* @Nullable */ List<ResponsePlanAction>> getActions() {
        return this.actions;
    }
    /**
     * The ARN of the response plan.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the response plan.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="chatChannel", type=ResponsePlanChatChannel.class, parameters={})
    private Output</* @Nullable */ ResponsePlanChatChannel> chatChannel;

    public Output</* @Nullable */ ResponsePlanChatChannel> getChatChannel() {
        return this.chatChannel;
    }
    /**
     * The display name of the response plan.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name of the response plan.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The list of engagements to use.
     * 
     */
    @OutputExport(name="engagements", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> engagements;

    /**
     * @return The list of engagements to use.
     * 
     */
    public Output</* @Nullable */ List<String>> getEngagements() {
        return this.engagements;
    }
    @OutputExport(name="incidentTemplate", type=ResponsePlanIncidentTemplate.class, parameters={})
    private Output<ResponsePlanIncidentTemplate> incidentTemplate;

    public Output<ResponsePlanIncidentTemplate> getIncidentTemplate() {
        return this.incidentTemplate;
    }
    /**
     * The name of the response plan.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the response plan.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The tags to apply to the response plan.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={ResponsePlanTag.class})
    private Output</* @Nullable */ List<ResponsePlanTag>> tags;

    /**
     * @return The tags to apply to the response plan.
     * 
     */
    public Output</* @Nullable */ List<ResponsePlanTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResponsePlan(String name) {
        this(name, ResponsePlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResponsePlan(String name, ResponsePlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResponsePlan(String name, ResponsePlanArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssmincidents:ResponsePlan", name, args == null ? ResponsePlanArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResponsePlan(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssmincidents:ResponsePlan", name, null, makeResourceOptions(options, id));
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
    public static ResponsePlan get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResponsePlan(name, id, options);
    }
}
