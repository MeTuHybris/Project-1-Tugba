package concerttours.service;
import java.util.Date;
import java.util.List;
import concerttours.model.NewsModel;

public interface NewService
{
    List<NewsModel> getNewsOfTheDay(Date date);
}