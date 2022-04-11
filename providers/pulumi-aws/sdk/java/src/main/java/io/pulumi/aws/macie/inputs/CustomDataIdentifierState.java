// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomDataIdentifierState extends io.pulumi.resources.ResourceArgs {

    public static final CustomDataIdentifierState Empty = new CustomDataIdentifierState();

    /**
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The date and time, in UTC and extended RFC 3339 format, when the Amazon Macie account was created.
     * 
     */
    @Import(name="createdAt")
      private final @Nullable Output<String> createdAt;

    public Output<String> getCreatedAt() {
        return this.createdAt == null ? Codegen.empty() : this.createdAt;
    }

    /**
     * A custom description of the custom data identifier. The description can contain as many as 512 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched by the regular expression is the same as any string in this array, Amazon Macie ignores it. The array can contain as many as 10 ignore words. Each ignore word can contain 4 - 90 characters. Ignore words are case sensitive.
     * 
     */
    @Import(name="ignoreWords")
      private final @Nullable Output<List<String>> ignoreWords;

    public Output<List<String>> getIgnoreWords() {
        return this.ignoreWords == null ? Codegen.empty() : this.ignoreWords;
    }

    /**
     * An array that lists specific character sequences (keywords), one of which must be within proximity (`maximum_match_distance`) of the regular expression to match. The array can contain as many as 50 keywords. Each keyword can contain 3 - 90 characters. Keywords aren't case sensitive.
     * 
     */
    @Import(name="keywords")
      private final @Nullable Output<List<String>> keywords;

    public Output<List<String>> getKeywords() {
        return this.keywords == null ? Codegen.empty() : this.keywords;
    }

    /**
     * The maximum number of characters that can exist between text that matches the regex pattern and the character sequences specified by the keywords array. Macie includes or excludes a result based on the proximity of a keyword to text that matches the regex pattern. The distance can be 1 - 300 characters. The default value is 50.
     * 
     */
    @Import(name="maximumMatchDistance")
      private final @Nullable Output<Integer> maximumMatchDistance;

    public Output<Integer> getMaximumMatchDistance() {
        return this.maximumMatchDistance == null ? Codegen.empty() : this.maximumMatchDistance;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * The regular expression (regex) that defines the pattern to match. The expression can contain as many as 512 characters.
     * 
     */
    @Import(name="regex")
      private final @Nullable Output<String> regex;

    public Output<String> getRegex() {
        return this.regex == null ? Codegen.empty() : this.regex;
    }

    /**
     * A map of key-value pairs that specifies the tags to associate with the custom data identifier.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public CustomDataIdentifierState(
        @Nullable Output<String> arn,
        @Nullable Output<String> createdAt,
        @Nullable Output<String> description,
        @Nullable Output<List<String>> ignoreWords,
        @Nullable Output<List<String>> keywords,
        @Nullable Output<Integer> maximumMatchDistance,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> regex,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.createdAt = createdAt;
        this.description = description;
        this.ignoreWords = ignoreWords;
        this.keywords = keywords;
        this.maximumMatchDistance = maximumMatchDistance;
        this.name = name;
        this.namePrefix = namePrefix;
        this.regex = regex;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private CustomDataIdentifierState() {
        this.arn = Codegen.empty();
        this.createdAt = Codegen.empty();
        this.description = Codegen.empty();
        this.ignoreWords = Codegen.empty();
        this.keywords = Codegen.empty();
        this.maximumMatchDistance = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.regex = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDataIdentifierState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> createdAt;
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> ignoreWords;
        private @Nullable Output<List<String>> keywords;
        private @Nullable Output<Integer> maximumMatchDistance;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> regex;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDataIdentifierState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.ignoreWords = defaults.ignoreWords;
    	      this.keywords = defaults.keywords;
    	      this.maximumMatchDistance = defaults.maximumMatchDistance;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.regex = defaults.regex;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder createdAt(@Nullable Output<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = Codegen.ofNullable(createdAt);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder ignoreWords(@Nullable Output<List<String>> ignoreWords) {
            this.ignoreWords = ignoreWords;
            return this;
        }
        public Builder ignoreWords(@Nullable List<String> ignoreWords) {
            this.ignoreWords = Codegen.ofNullable(ignoreWords);
            return this;
        }
        public Builder ignoreWords(String... ignoreWords) {
            return ignoreWords(List.of(ignoreWords));
        }
        public Builder keywords(@Nullable Output<List<String>> keywords) {
            this.keywords = keywords;
            return this;
        }
        public Builder keywords(@Nullable List<String> keywords) {
            this.keywords = Codegen.ofNullable(keywords);
            return this;
        }
        public Builder keywords(String... keywords) {
            return keywords(List.of(keywords));
        }
        public Builder maximumMatchDistance(@Nullable Output<Integer> maximumMatchDistance) {
            this.maximumMatchDistance = maximumMatchDistance;
            return this;
        }
        public Builder maximumMatchDistance(@Nullable Integer maximumMatchDistance) {
            this.maximumMatchDistance = Codegen.ofNullable(maximumMatchDistance);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder regex(@Nullable Output<String> regex) {
            this.regex = regex;
            return this;
        }
        public Builder regex(@Nullable String regex) {
            this.regex = Codegen.ofNullable(regex);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public CustomDataIdentifierState build() {
            return new CustomDataIdentifierState(arn, createdAt, description, ignoreWords, keywords, maximumMatchDistance, name, namePrefix, regex, tags, tagsAll);
        }
    }
}
