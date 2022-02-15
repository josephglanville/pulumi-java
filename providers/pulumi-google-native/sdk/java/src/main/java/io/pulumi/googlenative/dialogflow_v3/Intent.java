// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v3.IntentArgs;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3IntentParameterResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="google-native:dialogflow/v3:Intent")
public class Intent extends io.pulumi.resources.CustomResource {
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="isFallback", type=Boolean.class, parameters={})
    private Output<Boolean> isFallback;

    public Output<Boolean> getIsFallback() {
        return this.isFallback;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="parameters", type=List.class, parameters={GoogleCloudDialogflowCxV3IntentParameterResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3IntentParameterResponse>> parameters;

    public Output<List<GoogleCloudDialogflowCxV3IntentParameterResponse>> getParameters() {
        return this.parameters;
    }
    @OutputExport(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority;
    }
    @OutputExport(name="trainingPhrases", type=List.class, parameters={GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse>> trainingPhrases;

    public Output<List<GoogleCloudDialogflowCxV3IntentTrainingPhraseResponse>> getTrainingPhrases() {
        return this.trainingPhrases;
    }

    public Intent(String name, IntentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3:Intent", name, args == null ? IntentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Intent(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3:Intent", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Intent get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Intent(name, id, options);
    }
}