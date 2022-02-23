// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.NetworkInsightsAccessScopeAnalysisArgs;
import io.pulumi.awsnative.ec2.enums.NetworkInsightsAccessScopeAnalysisFindingsFound;
import io.pulumi.awsnative.ec2.enums.NetworkInsightsAccessScopeAnalysisStatus;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAccessScopeAnalysisTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::EC2::NetworkInsightsAccessScopeAnalysis
 * 
 */
@ResourceType(type="aws-native:ec2:NetworkInsightsAccessScopeAnalysis")
public class NetworkInsightsAccessScopeAnalysis extends io.pulumi.resources.CustomResource {
    @OutputExport(name="analyzedEniCount", type=Integer.class, parameters={})
    private Output<Integer> analyzedEniCount;

    public Output<Integer> getAnalyzedEniCount() {
        return this.analyzedEniCount;
    }
    @OutputExport(name="endDate", type=String.class, parameters={})
    private Output<String> endDate;

    public Output<String> getEndDate() {
        return this.endDate;
    }
    @OutputExport(name="findingsFound", type=NetworkInsightsAccessScopeAnalysisFindingsFound.class, parameters={})
    private Output<NetworkInsightsAccessScopeAnalysisFindingsFound> findingsFound;

    public Output<NetworkInsightsAccessScopeAnalysisFindingsFound> getFindingsFound() {
        return this.findingsFound;
    }
    @OutputExport(name="networkInsightsAccessScopeAnalysisArn", type=String.class, parameters={})
    private Output<String> networkInsightsAccessScopeAnalysisArn;

    public Output<String> getNetworkInsightsAccessScopeAnalysisArn() {
        return this.networkInsightsAccessScopeAnalysisArn;
    }
    @OutputExport(name="networkInsightsAccessScopeAnalysisId", type=String.class, parameters={})
    private Output<String> networkInsightsAccessScopeAnalysisId;

    public Output<String> getNetworkInsightsAccessScopeAnalysisId() {
        return this.networkInsightsAccessScopeAnalysisId;
    }
    @OutputExport(name="networkInsightsAccessScopeId", type=String.class, parameters={})
    private Output<String> networkInsightsAccessScopeId;

    public Output<String> getNetworkInsightsAccessScopeId() {
        return this.networkInsightsAccessScopeId;
    }
    @OutputExport(name="startDate", type=String.class, parameters={})
    private Output<String> startDate;

    public Output<String> getStartDate() {
        return this.startDate;
    }
    @OutputExport(name="status", type=NetworkInsightsAccessScopeAnalysisStatus.class, parameters={})
    private Output<NetworkInsightsAccessScopeAnalysisStatus> status;

    public Output<NetworkInsightsAccessScopeAnalysisStatus> getStatus() {
        return this.status;
    }
    @OutputExport(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    public Output<String> getStatusMessage() {
        return this.statusMessage;
    }
    @OutputExport(name="tags", type=List.class, parameters={NetworkInsightsAccessScopeAnalysisTag.class})
    private Output</* @Nullable */ List<NetworkInsightsAccessScopeAnalysisTag>> tags;

    public Output</* @Nullable */ List<NetworkInsightsAccessScopeAnalysisTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkInsightsAccessScopeAnalysis(String name) {
        this(name, NetworkInsightsAccessScopeAnalysisArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkInsightsAccessScopeAnalysis(String name, NetworkInsightsAccessScopeAnalysisArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkInsightsAccessScopeAnalysis(String name, NetworkInsightsAccessScopeAnalysisArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:NetworkInsightsAccessScopeAnalysis", name, args == null ? NetworkInsightsAccessScopeAnalysisArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NetworkInsightsAccessScopeAnalysis(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:NetworkInsightsAccessScopeAnalysis", name, null, makeResourceOptions(options, id));
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
    public static NetworkInsightsAccessScopeAnalysis get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkInsightsAccessScopeAnalysis(name, id, options);
    }
}
