// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.wisdom.inputs.GetAssistantArgs;
import io.pulumi.awsnative.wisdom.inputs.GetAssistantAssociationArgs;
import io.pulumi.awsnative.wisdom.inputs.GetKnowledgeBaseArgs;
import io.pulumi.awsnative.wisdom.outputs.GetAssistantAssociationResult;
import io.pulumi.awsnative.wisdom.outputs.GetAssistantResult;
import io.pulumi.awsnative.wisdom.outputs.GetKnowledgeBaseResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class WisdomFunctions {
    /**
     * Definition of AWS::Wisdom::Assistant Resource Type
     * 
     */
    public static CompletableFuture<GetAssistantResult> getAssistant(GetAssistantArgs args) {
        return getAssistant(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAssistantResult> getAssistant(GetAssistantArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:wisdom:getAssistant", TypeShape.of(GetAssistantResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of AWS::Wisdom::AssistantAssociation Resource Type
     * 
     */
    public static CompletableFuture<GetAssistantAssociationResult> getAssistantAssociation(GetAssistantAssociationArgs args) {
        return getAssistantAssociation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAssistantAssociationResult> getAssistantAssociation(GetAssistantAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:wisdom:getAssistantAssociation", TypeShape.of(GetAssistantAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of AWS::Wisdom::KnowledgeBase Resource Type
     * 
     */
    public static CompletableFuture<GetKnowledgeBaseResult> getKnowledgeBase(GetKnowledgeBaseArgs args) {
        return getKnowledgeBase(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKnowledgeBaseResult> getKnowledgeBase(GetKnowledgeBaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:wisdom:getKnowledgeBase", TypeShape.of(GetKnowledgeBaseResult.class), args, Utilities.withVersion(options));
    }
}
