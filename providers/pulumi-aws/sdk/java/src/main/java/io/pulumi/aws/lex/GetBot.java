// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.lex.inputs.GetBotArgs;
import io.pulumi.aws.lex.outputs.GetBotResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBot {
    private GetBot() {}
    /**
         * Provides details about a specific Amazon Lex Bot.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getBot.
     * 
     *
         * A collection of values returned by getBot.
     * 
     */
    public static CompletableFuture<GetBotResult> invokeAsync(GetBotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lex/getBot:getBot", TypeShape.of(GetBotResult.class), args == null ? GetBotArgs.Empty : args, Utilities.withVersion(options));
    }
}