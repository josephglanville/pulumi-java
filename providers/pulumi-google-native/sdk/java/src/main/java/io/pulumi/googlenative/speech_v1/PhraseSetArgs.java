// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.speech_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.speech_v1.inputs.PhraseArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PhraseSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PhraseSetArgs Empty = new PhraseSetArgs();

    @InputImport(name="boost")
    private final @Nullable Input<Double> boost;

    public Input<Double> getBoost() {
        return this.boost == null ? Input.empty() : this.boost;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="phraseSetId", required=true)
    private final Input<String> phraseSetId;

    public Input<String> getPhraseSetId() {
        return this.phraseSetId;
    }

    @InputImport(name="phrases")
    private final @Nullable Input<List<PhraseArgs>> phrases;

    public Input<List<PhraseArgs>> getPhrases() {
        return this.phrases == null ? Input.empty() : this.phrases;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public PhraseSetArgs(
        @Nullable Input<Double> boost,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        Input<String> phraseSetId,
        @Nullable Input<List<PhraseArgs>> phrases,
        @Nullable Input<String> project) {
        this.boost = boost;
        this.location = location;
        this.name = name;
        this.phraseSetId = Objects.requireNonNull(phraseSetId, "expected parameter 'phraseSetId' to be non-null");
        this.phrases = phrases;
        this.project = project;
    }

    private PhraseSetArgs() {
        this.boost = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.phraseSetId = Input.empty();
        this.phrases = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PhraseSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> boost;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private Input<String> phraseSetId;
        private @Nullable Input<List<PhraseArgs>> phrases;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(PhraseSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boost = defaults.boost;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.phraseSetId = defaults.phraseSetId;
    	      this.phrases = defaults.phrases;
    	      this.project = defaults.project;
        }

        public Builder setBoost(@Nullable Input<Double> boost) {
            this.boost = boost;
            return this;
        }

        public Builder setBoost(@Nullable Double boost) {
            this.boost = Input.ofNullable(boost);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPhraseSetId(Input<String> phraseSetId) {
            this.phraseSetId = Objects.requireNonNull(phraseSetId);
            return this;
        }

        public Builder setPhraseSetId(String phraseSetId) {
            this.phraseSetId = Input.of(Objects.requireNonNull(phraseSetId));
            return this;
        }

        public Builder setPhrases(@Nullable Input<List<PhraseArgs>> phrases) {
            this.phrases = phrases;
            return this;
        }

        public Builder setPhrases(@Nullable List<PhraseArgs> phrases) {
            this.phrases = Input.ofNullable(phrases);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public PhraseSetArgs build() {
            return new PhraseSetArgs(boost, location, name, phraseSetId, phrases, project);
        }
    }
}