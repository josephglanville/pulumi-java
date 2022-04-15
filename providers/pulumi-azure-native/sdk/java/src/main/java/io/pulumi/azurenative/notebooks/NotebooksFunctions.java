// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notebooks;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.notebooks.inputs.GetNotebookProxyArgs;
import io.pulumi.azurenative.notebooks.inputs.ListNotebookProxyCredentialsArgs;
import io.pulumi.azurenative.notebooks.outputs.GetNotebookProxyResult;
import io.pulumi.azurenative.notebooks.outputs.ListNotebookProxyCredentialsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class NotebooksFunctions {
    /**
     * A NotebookProxy resource.
     * API Version: 2019-10-11-preview.
     * 
     */
    public static CompletableFuture<GetNotebookProxyResult> getNotebookProxy(GetNotebookProxyArgs args) {
        return getNotebookProxy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNotebookProxyResult> getNotebookProxy(GetNotebookProxyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:notebooks:getNotebookProxy", TypeShape.of(GetNotebookProxyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Credentials and other properties of NotebookProxy resource
     * API Version: 2019-10-11-preview.
     * 
     */
    public static CompletableFuture<ListNotebookProxyCredentialsResult> listNotebookProxyCredentials(ListNotebookProxyCredentialsArgs args) {
        return listNotebookProxyCredentials(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListNotebookProxyCredentialsResult> listNotebookProxyCredentials(ListNotebookProxyCredentialsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:notebooks:listNotebookProxyCredentials", TypeShape.of(ListNotebookProxyCredentialsResult.class), args, Utilities.withVersion(options));
    }
}