// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.GenericArtifactsContent;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.GenericArtifactsContent.inputs.GetArtifactByPathArgs;
import com.pulumi.oci.GenericArtifactsContent.inputs.GetGenericArtifactsContentArgs;
import com.pulumi.oci.GenericArtifactsContent.outputs.GetArtifactByPathResult;
import com.pulumi.oci.GenericArtifactsContent.outputs.GetGenericArtifactsContentResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class GenericArtifactsContentFunctions {
    /**
     * This data source provides details about a specific Artifact By Path resource in Oracle Cloud Infrastructure Generic Artifacts Content service.
     * 
     * Get generic artifact content.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetArtifactByPathResult> getArtifactByPath(GetArtifactByPathArgs args) {
        return getArtifactByPath(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetArtifactByPathResult> getArtifactByPath(GetArtifactByPathArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:GenericArtifactsContent/getArtifactByPath:getArtifactByPath", TypeShape.of(GetArtifactByPathResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Generic Artifacts Content resource in Oracle Cloud Infrastructure Generic Artifacts Content service.
     * 
     * Gets the specified artifact&#39;s content.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetGenericArtifactsContentResult> getGenericArtifactsContent(GetGenericArtifactsContentArgs args) {
        return getGenericArtifactsContent(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGenericArtifactsContentResult> getGenericArtifactsContent(GetGenericArtifactsContentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:GenericArtifactsContent/getGenericArtifactsContent:getGenericArtifactsContent", TypeShape.of(GetGenericArtifactsContentResult.class), args, Utilities.withVersion(options));
    }
}
