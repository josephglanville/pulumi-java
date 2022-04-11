// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3AudioInputArgs;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3DtmfInputArgs;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3EventInputArgs;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3IntentInputArgs;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3TextInputArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the query input. It can contain one of: 1. A conversational query in the form of text. 2. An intent query that specifies which intent to trigger. 3. Natural language speech audio to be processed. 4. An event to be triggered.
 * 
 */
public final class GoogleCloudDialogflowCxV3QueryInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3QueryInputArgs Empty = new GoogleCloudDialogflowCxV3QueryInputArgs();

    /**
     * The natural language speech audio to be processed.
     * 
     */
    @Import(name="audio")
      private final @Nullable Output<GoogleCloudDialogflowCxV3AudioInputArgs> audio;

    public Output<GoogleCloudDialogflowCxV3AudioInputArgs> getAudio() {
        return this.audio == null ? Codegen.empty() : this.audio;
    }

    /**
     * The DTMF event to be handled.
     * 
     */
    @Import(name="dtmf")
      private final @Nullable Output<GoogleCloudDialogflowCxV3DtmfInputArgs> dtmf;

    public Output<GoogleCloudDialogflowCxV3DtmfInputArgs> getDtmf() {
        return this.dtmf == null ? Codegen.empty() : this.dtmf;
    }

    /**
     * The event to be triggered.
     * 
     */
    @Import(name="event")
      private final @Nullable Output<GoogleCloudDialogflowCxV3EventInputArgs> event;

    public Output<GoogleCloudDialogflowCxV3EventInputArgs> getEvent() {
        return this.event == null ? Codegen.empty() : this.event;
    }

    /**
     * The intent to be triggered.
     * 
     */
    @Import(name="intent")
      private final @Nullable Output<GoogleCloudDialogflowCxV3IntentInputArgs> intent;

    public Output<GoogleCloudDialogflowCxV3IntentInputArgs> getIntent() {
        return this.intent == null ? Codegen.empty() : this.intent;
    }

    /**
     * The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. Note that queries in the same session do not necessarily need to specify the same language.
     * 
     */
    @Import(name="languageCode", required=true)
      private final Output<String> languageCode;

    public Output<String> getLanguageCode() {
        return this.languageCode;
    }

    /**
     * The natural language text to be processed.
     * 
     */
    @Import(name="text")
      private final @Nullable Output<GoogleCloudDialogflowCxV3TextInputArgs> text;

    public Output<GoogleCloudDialogflowCxV3TextInputArgs> getText() {
        return this.text == null ? Codegen.empty() : this.text;
    }

    public GoogleCloudDialogflowCxV3QueryInputArgs(
        @Nullable Output<GoogleCloudDialogflowCxV3AudioInputArgs> audio,
        @Nullable Output<GoogleCloudDialogflowCxV3DtmfInputArgs> dtmf,
        @Nullable Output<GoogleCloudDialogflowCxV3EventInputArgs> event,
        @Nullable Output<GoogleCloudDialogflowCxV3IntentInputArgs> intent,
        Output<String> languageCode,
        @Nullable Output<GoogleCloudDialogflowCxV3TextInputArgs> text) {
        this.audio = audio;
        this.dtmf = dtmf;
        this.event = event;
        this.intent = intent;
        this.languageCode = Objects.requireNonNull(languageCode, "expected parameter 'languageCode' to be non-null");
        this.text = text;
    }

    private GoogleCloudDialogflowCxV3QueryInputArgs() {
        this.audio = Codegen.empty();
        this.dtmf = Codegen.empty();
        this.event = Codegen.empty();
        this.intent = Codegen.empty();
        this.languageCode = Codegen.empty();
        this.text = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3QueryInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudDialogflowCxV3AudioInputArgs> audio;
        private @Nullable Output<GoogleCloudDialogflowCxV3DtmfInputArgs> dtmf;
        private @Nullable Output<GoogleCloudDialogflowCxV3EventInputArgs> event;
        private @Nullable Output<GoogleCloudDialogflowCxV3IntentInputArgs> intent;
        private Output<String> languageCode;
        private @Nullable Output<GoogleCloudDialogflowCxV3TextInputArgs> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3QueryInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audio = defaults.audio;
    	      this.dtmf = defaults.dtmf;
    	      this.event = defaults.event;
    	      this.intent = defaults.intent;
    	      this.languageCode = defaults.languageCode;
    	      this.text = defaults.text;
        }

        public Builder audio(@Nullable Output<GoogleCloudDialogflowCxV3AudioInputArgs> audio) {
            this.audio = audio;
            return this;
        }
        public Builder audio(@Nullable GoogleCloudDialogflowCxV3AudioInputArgs audio) {
            this.audio = Codegen.ofNullable(audio);
            return this;
        }
        public Builder dtmf(@Nullable Output<GoogleCloudDialogflowCxV3DtmfInputArgs> dtmf) {
            this.dtmf = dtmf;
            return this;
        }
        public Builder dtmf(@Nullable GoogleCloudDialogflowCxV3DtmfInputArgs dtmf) {
            this.dtmf = Codegen.ofNullable(dtmf);
            return this;
        }
        public Builder event(@Nullable Output<GoogleCloudDialogflowCxV3EventInputArgs> event) {
            this.event = event;
            return this;
        }
        public Builder event(@Nullable GoogleCloudDialogflowCxV3EventInputArgs event) {
            this.event = Codegen.ofNullable(event);
            return this;
        }
        public Builder intent(@Nullable Output<GoogleCloudDialogflowCxV3IntentInputArgs> intent) {
            this.intent = intent;
            return this;
        }
        public Builder intent(@Nullable GoogleCloudDialogflowCxV3IntentInputArgs intent) {
            this.intent = Codegen.ofNullable(intent);
            return this;
        }
        public Builder languageCode(Output<String> languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }
        public Builder languageCode(String languageCode) {
            this.languageCode = Output.of(Objects.requireNonNull(languageCode));
            return this;
        }
        public Builder text(@Nullable Output<GoogleCloudDialogflowCxV3TextInputArgs> text) {
            this.text = text;
            return this;
        }
        public Builder text(@Nullable GoogleCloudDialogflowCxV3TextInputArgs text) {
            this.text = Codegen.ofNullable(text);
            return this;
        }        public GoogleCloudDialogflowCxV3QueryInputArgs build() {
            return new GoogleCloudDialogflowCxV3QueryInputArgs(audio, dtmf, event, intent, languageCode, text);
        }
    }
}
