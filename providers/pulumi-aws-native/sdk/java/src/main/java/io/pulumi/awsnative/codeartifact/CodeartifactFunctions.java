// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codeartifact;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.codeartifact.inputs.GetDomainArgs;
import io.pulumi.awsnative.codeartifact.inputs.GetRepositoryArgs;
import io.pulumi.awsnative.codeartifact.outputs.GetDomainResult;
import io.pulumi.awsnative.codeartifact.outputs.GetRepositoryResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CodeartifactFunctions {
    /**
     * The resource schema to create a CodeArtifact domain.
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomain(GetDomainArgs args) {
        return getDomain(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDomainResult> getDomain(GetDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:codeartifact:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The resource schema to create a CodeArtifact repository.
     * 
     */
    public static CompletableFuture<GetRepositoryResult> getRepository(GetRepositoryArgs args) {
        return getRepository(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRepositoryResult> getRepository(GetRepositoryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:codeartifact:getRepository", TypeShape.of(GetRepositoryResult.class), args, Utilities.withVersion(options));
    }
}