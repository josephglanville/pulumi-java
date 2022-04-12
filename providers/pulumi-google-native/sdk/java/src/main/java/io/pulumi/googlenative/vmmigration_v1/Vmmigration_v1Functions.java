// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vmmigration_v1.inputs.GetCloneJobArgs;
import io.pulumi.googlenative.vmmigration_v1.inputs.GetCutoverJobArgs;
import io.pulumi.googlenative.vmmigration_v1.inputs.GetDatacenterConnectorArgs;
import io.pulumi.googlenative.vmmigration_v1.inputs.GetGroupArgs;
import io.pulumi.googlenative.vmmigration_v1.inputs.GetMigratingVmArgs;
import io.pulumi.googlenative.vmmigration_v1.inputs.GetSourceArgs;
import io.pulumi.googlenative.vmmigration_v1.inputs.GetTargetProjectArgs;
import io.pulumi.googlenative.vmmigration_v1.inputs.GetUtilizationReportArgs;
import io.pulumi.googlenative.vmmigration_v1.outputs.GetCloneJobResult;
import io.pulumi.googlenative.vmmigration_v1.outputs.GetCutoverJobResult;
import io.pulumi.googlenative.vmmigration_v1.outputs.GetDatacenterConnectorResult;
import io.pulumi.googlenative.vmmigration_v1.outputs.GetGroupResult;
import io.pulumi.googlenative.vmmigration_v1.outputs.GetMigratingVmResult;
import io.pulumi.googlenative.vmmigration_v1.outputs.GetSourceResult;
import io.pulumi.googlenative.vmmigration_v1.outputs.GetTargetProjectResult;
import io.pulumi.googlenative.vmmigration_v1.outputs.GetUtilizationReportResult;
import java.util.concurrent.CompletableFuture;

public final class Vmmigration_v1Functions {
    /**
     * Gets details of a single CloneJob.
     * 
     */
    public static CompletableFuture<GetCloneJobResult> getCloneJob(GetCloneJobArgs args) {
        return getCloneJob(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCloneJobResult> getCloneJob(GetCloneJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vmmigration/v1:getCloneJob", TypeShape.of(GetCloneJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single CutoverJob.
     * 
     */
    public static CompletableFuture<GetCutoverJobResult> getCutoverJob(GetCutoverJobArgs args) {
        return getCutoverJob(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCutoverJobResult> getCutoverJob(GetCutoverJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vmmigration/v1:getCutoverJob", TypeShape.of(GetCutoverJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single DatacenterConnector.
     * 
     */
    public static CompletableFuture<GetDatacenterConnectorResult> getDatacenterConnector(GetDatacenterConnectorArgs args) {
        return getDatacenterConnector(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDatacenterConnectorResult> getDatacenterConnector(GetDatacenterConnectorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vmmigration/v1:getDatacenterConnector", TypeShape.of(GetDatacenterConnectorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Group.
     * 
     */
    public static CompletableFuture<GetGroupResult> getGroup(GetGroupArgs args) {
        return getGroup(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGroupResult> getGroup(GetGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vmmigration/v1:getGroup", TypeShape.of(GetGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single MigratingVm.
     * 
     */
    public static CompletableFuture<GetMigratingVmResult> getMigratingVm(GetMigratingVmArgs args) {
        return getMigratingVm(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetMigratingVmResult> getMigratingVm(GetMigratingVmArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vmmigration/v1:getMigratingVm", TypeShape.of(GetMigratingVmResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Source.
     * 
     */
    public static CompletableFuture<GetSourceResult> getSource(GetSourceArgs args) {
        return getSource(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSourceResult> getSource(GetSourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vmmigration/v1:getSource", TypeShape.of(GetSourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single TargetProject. NOTE: TargetProject is a global resource; hence the only supported value for location is `global`.
     * 
     */
    public static CompletableFuture<GetTargetProjectResult> getTargetProject(GetTargetProjectArgs args) {
        return getTargetProject(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTargetProjectResult> getTargetProject(GetTargetProjectArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vmmigration/v1:getTargetProject", TypeShape.of(GetTargetProjectResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a single Utilization Report.
     * 
     */
    public static CompletableFuture<GetUtilizationReportResult> getUtilizationReport(GetUtilizationReportArgs args) {
        return getUtilizationReport(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetUtilizationReportResult> getUtilizationReport(GetUtilizationReportArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vmmigration/v1:getUtilizationReport", TypeShape.of(GetUtilizationReportResult.class), args, Utilities.withVersion(options));
    }
}
