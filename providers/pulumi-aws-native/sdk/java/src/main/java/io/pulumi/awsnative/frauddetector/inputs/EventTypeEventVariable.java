// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.inputs;

import io.pulumi.awsnative.frauddetector.enums.EventTypeEventVariableDataSource;
import io.pulumi.awsnative.frauddetector.enums.EventTypeEventVariableDataType;
import io.pulumi.awsnative.frauddetector.enums.EventTypeEventVariableVariableType;
import io.pulumi.awsnative.frauddetector.inputs.EventTypeTag;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventTypeEventVariable extends io.pulumi.resources.InvokeArgs {

    public static final EventTypeEventVariable Empty = new EventTypeEventVariable();

    @InputImport(name="arn")
      private final @Nullable String arn;

    public Optional<String> getArn() {
        return this.arn == null ? Optional.empty() : Optional.ofNullable(this.arn);
    }

    /**
     * The time when the event type was created.
     * 
     */
    @InputImport(name="createdTime")
      private final @Nullable String createdTime;

    public Optional<String> getCreatedTime() {
        return this.createdTime == null ? Optional.empty() : Optional.ofNullable(this.createdTime);
    }

    @InputImport(name="dataSource")
      private final @Nullable EventTypeEventVariableDataSource dataSource;

    public Optional<EventTypeEventVariableDataSource> getDataSource() {
        return this.dataSource == null ? Optional.empty() : Optional.ofNullable(this.dataSource);
    }

    @InputImport(name="dataType")
      private final @Nullable EventTypeEventVariableDataType dataType;

    public Optional<EventTypeEventVariableDataType> getDataType() {
        return this.dataType == null ? Optional.empty() : Optional.ofNullable(this.dataType);
    }

    @InputImport(name="defaultValue")
      private final @Nullable String defaultValue;

    public Optional<String> getDefaultValue() {
        return this.defaultValue == null ? Optional.empty() : Optional.ofNullable(this.defaultValue);
    }

    /**
     * The description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="inline")
      private final @Nullable Boolean inline;

    public Optional<Boolean> getInline() {
        return this.inline == null ? Optional.empty() : Optional.ofNullable(this.inline);
    }

    /**
     * The time when the event type was last updated.
     * 
     */
    @InputImport(name="lastUpdatedTime")
      private final @Nullable String lastUpdatedTime;

    public Optional<String> getLastUpdatedTime() {
        return this.lastUpdatedTime == null ? Optional.empty() : Optional.ofNullable(this.lastUpdatedTime);
    }

    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Tags associated with this event type.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable List<EventTypeTag> tags;

    public List<EventTypeTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    @InputImport(name="variableType")
      private final @Nullable EventTypeEventVariableVariableType variableType;

    public Optional<EventTypeEventVariableVariableType> getVariableType() {
        return this.variableType == null ? Optional.empty() : Optional.ofNullable(this.variableType);
    }

    public EventTypeEventVariable(
        @Nullable String arn,
        @Nullable String createdTime,
        @Nullable EventTypeEventVariableDataSource dataSource,
        @Nullable EventTypeEventVariableDataType dataType,
        @Nullable String defaultValue,
        @Nullable String description,
        @Nullable Boolean inline,
        @Nullable String lastUpdatedTime,
        @Nullable String name,
        @Nullable List<EventTypeTag> tags,
        @Nullable EventTypeEventVariableVariableType variableType) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.dataSource = dataSource;
        this.dataType = dataType;
        this.defaultValue = defaultValue;
        this.description = description;
        this.inline = inline;
        this.lastUpdatedTime = lastUpdatedTime;
        this.name = name;
        this.tags = tags;
        this.variableType = variableType;
    }

    private EventTypeEventVariable() {
        this.arn = null;
        this.createdTime = null;
        this.dataSource = null;
        this.dataType = null;
        this.defaultValue = null;
        this.description = null;
        this.inline = null;
        this.lastUpdatedTime = null;
        this.name = null;
        this.tags = List.of();
        this.variableType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTypeEventVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable EventTypeEventVariableDataSource dataSource;
        private @Nullable EventTypeEventVariableDataType dataType;
        private @Nullable String defaultValue;
        private @Nullable String description;
        private @Nullable Boolean inline;
        private @Nullable String lastUpdatedTime;
        private @Nullable String name;
        private @Nullable List<EventTypeTag> tags;
        private @Nullable EventTypeEventVariableVariableType variableType;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTypeEventVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.dataSource = defaults.dataSource;
    	      this.dataType = defaults.dataType;
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.inline = defaults.inline;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.variableType = defaults.variableType;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setDataSource(@Nullable EventTypeEventVariableDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Builder setDataType(@Nullable EventTypeEventVariableDataType dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setDefaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setInline(@Nullable Boolean inline) {
            this.inline = inline;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTags(@Nullable List<EventTypeTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVariableType(@Nullable EventTypeEventVariableVariableType variableType) {
            this.variableType = variableType;
            return this;
        }
        public EventTypeEventVariable build() {
            return new EventTypeEventVariable(arn, createdTime, dataSource, dataType, defaultValue, description, inline, lastUpdatedTime, name, tags, variableType);
        }
    }
}
