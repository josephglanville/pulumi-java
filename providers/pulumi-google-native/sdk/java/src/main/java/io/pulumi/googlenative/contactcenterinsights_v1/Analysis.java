// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.contactcenterinsights_v1.AnalysisArgs;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1AnalysisResultResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an analysis. The long running operation is done when the analysis has completed.
 * 
 */
@ResourceType(type="google-native:contactcenterinsights/v1:Analysis")
public class Analysis extends io.pulumi.resources.CustomResource {
    /**
     * The result of the analysis, which is populated when the analysis finishes.
     * 
     */
    @OutputExport(name="analysisResult", type=GoogleCloudContactcenterinsightsV1AnalysisResultResponse.class, parameters={})
    private Output<GoogleCloudContactcenterinsightsV1AnalysisResultResponse> analysisResult;

    /**
     * @return The result of the analysis, which is populated when the analysis finishes.
     * 
     */
    public Output<GoogleCloudContactcenterinsightsV1AnalysisResultResponse> getAnalysisResult() {
        return this.analysisResult;
    }
    /**
     * The time at which the analysis was created, which occurs when the long-running operation completes.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which the analysis was created, which occurs when the long-running operation completes.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Immutable. The resource name of the analysis. Format: projects/{project}/locations/{location}/conversations/{conversation}/analyses/{analysis}
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The resource name of the analysis. Format: projects/{project}/locations/{location}/conversations/{conversation}/analyses/{analysis}
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The time at which the analysis was requested.
     * 
     */
    @OutputExport(name="requestTime", type=String.class, parameters={})
    private Output<String> requestTime;

    /**
     * @return The time at which the analysis was requested.
     * 
     */
    public Output<String> getRequestTime() {
        return this.requestTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Analysis(String name) {
        this(name, AnalysisArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Analysis(String name, AnalysisArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Analysis(String name, AnalysisArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:contactcenterinsights/v1:Analysis", name, args == null ? AnalysisArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Analysis(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:contactcenterinsights/v1:Analysis", name, null, makeResourceOptions(options, id));
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
    public static Analysis get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Analysis(name, id, options);
    }
}
