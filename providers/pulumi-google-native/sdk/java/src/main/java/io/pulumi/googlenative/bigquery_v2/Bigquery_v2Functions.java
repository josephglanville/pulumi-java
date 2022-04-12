// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigquery_v2.inputs.GetDatasetArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.GetJobArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.GetRoutineArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.GetRowAccessPolicyIamPolicyArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.GetTableArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.GetTableIamPolicyArgs;
import io.pulumi.googlenative.bigquery_v2.outputs.GetDatasetResult;
import io.pulumi.googlenative.bigquery_v2.outputs.GetJobResult;
import io.pulumi.googlenative.bigquery_v2.outputs.GetRoutineResult;
import io.pulumi.googlenative.bigquery_v2.outputs.GetRowAccessPolicyIamPolicyResult;
import io.pulumi.googlenative.bigquery_v2.outputs.GetTableIamPolicyResult;
import io.pulumi.googlenative.bigquery_v2.outputs.GetTableResult;
import java.util.concurrent.CompletableFuture;

public final class Bigquery_v2Functions {
    /**
     * Returns the dataset specified by datasetID.
     * 
     */
    public static CompletableFuture<GetDatasetResult> getDataset(GetDatasetArgs args) {
        return getDataset(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDatasetResult> getDataset(GetDatasetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigquery/v2:getDataset", TypeShape.of(GetDatasetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns information about a specific job. Job information is available for a six month period after creation. Requires that you're the person who ran the job, or have the Is Owner project role.
     * 
     */
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args) {
        return getJob(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigquery/v2:getJob", TypeShape.of(GetJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified routine resource by routine ID.
     * 
     */
    public static CompletableFuture<GetRoutineResult> getRoutine(GetRoutineArgs args) {
        return getRoutine(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRoutineResult> getRoutine(GetRoutineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigquery/v2:getRoutine", TypeShape.of(GetRoutineResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetRowAccessPolicyIamPolicyResult> getRowAccessPolicyIamPolicy(GetRowAccessPolicyIamPolicyArgs args) {
        return getRowAccessPolicyIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRowAccessPolicyIamPolicyResult> getRowAccessPolicyIamPolicy(GetRowAccessPolicyIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigquery/v2:getRowAccessPolicyIamPolicy", TypeShape.of(GetRowAccessPolicyIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes the structure of this table.
     * 
     */
    public static CompletableFuture<GetTableResult> getTable(GetTableArgs args) {
        return getTable(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTableResult> getTable(GetTableArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigquery/v2:getTable", TypeShape.of(GetTableResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetTableIamPolicyResult> getTableIamPolicy(GetTableIamPolicyArgs args) {
        return getTableIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTableIamPolicyResult> getTableIamPolicy(GetTableIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigquery/v2:getTableIamPolicy", TypeShape.of(GetTableIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
